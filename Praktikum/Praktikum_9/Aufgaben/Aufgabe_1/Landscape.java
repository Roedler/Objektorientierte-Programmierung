package Praktikum.Praktikum_9.Aufgaben.Aufgabe_1;

import java.io.*;
import java.nio.file.Paths;

/**
 * The Landscape class models a rectangular grid of tiles.
 */
public class Landscape {

    /**
     * Enum representing the types of tiles that can be placed in the landscape.
     */
    public enum Tile {
        SOIL,   // Represents soil terrain
        WATER,  // Represents water terrain
        BEACH   // Represents beach terrain
    }

    /**
     * The absolute path to the directory containing landscape files.
     */
    public final static String ABSOLUTE_PATH = Paths.get("").toAbsolutePath() + "/Praktikum/Praktikum_9/Aufgaben/Aufgabe_1/";

    private final int width;    // The width of the landscape grid
    private final int height;   // The height of the landscape grid
    private final Tile[][] tiles; // 2D array storing the tiles of the landscape

    /**
     * Constructs a new Landscape with the specified width and height.
     * All tiles are initialized to WATER by default.
     *
     * @param width  The width of the landscape (must be positive).
     * @param height The height of the landscape (must be positive).
     * @throws IllegalArgumentException If width or height is less than or equal to zero.
     */
    public Landscape(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Breite und Höhe müssen positive Werte sein.");
        }
        this.width = width;
        this.height = height;
        this.tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.tiles[i][j] = Tile.WATER;
            }
        }
    }

    /**
     * Returns the width of the landscape.
     *
     * @return The width of the landscape grid.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the landscape.
     *
     * @return The height of the landscape grid.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the tile at the specified position in the landscape.
     *
     * @param x    The x-coordinate of the tile (0-based index).
     * @param y    The y-coordinate of the tile (0-based index).
     * @param tile The tile type to set (must not be null).
     * @throws IllegalArgumentException If the coordinates are out of bounds or the tile is null.
     */
    public void setTile(int x, int y, Tile tile) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException("Ungültige Koordinaten: (" + x + ", " + y + "). Sie müssen innerhalb [0, " + (width - 1) + "] für x und [0, " + (height - 1) + "] für y liegen.");
        }
        if (tile == null) {
            throw new IllegalArgumentException("Kachel-Typ darf nicht null sein.");
        }
        this.tiles[y][x] = tile;
    }

    /**
     * Retrieves the tile at the specified position in the landscape.
     *
     * @param x The x-coordinate of the tile (0-based index).
     * @param y The y-coordinate of the tile (0-based index).
     * @return The tile type at the specified position.
     * @throws IllegalArgumentException If the coordinates are out of bounds.
     */
    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException("Ungültige Koordinaten: (" + x + ", " + y + "). Sie müssen innerhalb [0, " + (width - 1) + "] für x und [0, " + (height - 1) + "] für y liegen.");
        }
        return this.tiles[y][x];
    }

    /**
     * Writes the landscape to the specified output stream in a specific format.
     * The format includes a header ("landscape" line), dimensions (width x height), and the tile grid.
     *
     * @param landscape The landscape to write.
     * @param out       The output stream to write to.
     * @throws IOException If an I/O error occurs during writing.
     */
    public void writeLandscape(Landscape landscape, OutputStream out) throws IOException {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
        writer.println("landscape");
        writer.println(landscape.getWidth() + "x" + landscape.getHeight());
        for (int y = 0; y < landscape.getHeight(); y++) {
            StringBuilder row = new StringBuilder();
            for (int x = 0; x < landscape.getWidth(); x++) {
                switch (landscape.getTile(x, y)) {
                    case SOIL -> row.append('X');
                    case WATER -> row.append('~');
                    case BEACH -> row.append('.');
                }
            }
            writer.println(row);
        }
        writer.flush();
    }

    /**
     * Reads a landscape from the specified input stream.
     * The input must follow the format: a "landscape" header, dimensions (width x height),
     * and the tile grid with specific characters for each tile type.
     *
     * @param in The input stream to read from.
     * @return A new Landscape object constructed from the input.
     * @throws IOException            If an I/O error occurs during reading.
     * @throws InvalidFormatException If the input format is invalid.
     */
    public static Landscape readLandscape(InputStream in) throws IOException, InvalidFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line = reader.readLine();
        if (line == null || !line.equals("landscape")) {
            throw new InvalidFormatException("Erste Zeile muss 'landscape' sein.");
        }

        line = reader.readLine();
        if (line == null || !line.matches("\\d+x\\d+")) {
            throw new InvalidFormatException("Zweite Zeile muss im Format '{{ Breite }} x {{ Höhe }}' sein.");
        }

        String[] dimensions = line.split("x");
        int width;
        int height;
        try {
            width = Integer.parseInt(dimensions[0]);
            height = Integer.parseInt(dimensions[1]);
        } catch (NumberFormatException e) {
            throw new InvalidFormatException("Breite und Höhe müssen ganze Zahlen sein.");
        }
        if (width <= 0 || height <= 0) {
            throw new InvalidFormatException("Breite und Höhe müssen positiv sein.");
        }

        Landscape landscape = new Landscape(width, height);
        for (int y = 0; y < height; y++) {
            line = reader.readLine();
            if (line == null || line.length() != width) {
                throw new InvalidFormatException("Ungültige Zeilenlänge in Zeile " + (y + 3) + ".");
            }

            for (int x = 0; x < width; x++) {
                char c = line.charAt(x);
                Tile tile = switch (c) {
                    case '~' -> Tile.WATER;
                    case '.' -> Tile.BEACH;
                    case 'X' -> Tile.SOIL;
                    default ->
                            throw new InvalidFormatException("Ungültiges Zeichen '" + c + "' in Zeile " + (y + 3) + ", Spalte " + (x + 1) + ".");
                };
                landscape.setTile(x, y, tile);
            }
        }
        return landscape;
    }

    /**
     * Returns a string representation of the landscape.
     * Each tile is represented by a character: 'X' for SOIL, '~' for WATER, '.' for BEACH.
     *
     * @return A string representing the landscape grid.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                switch (tiles[i][j]) {
                    case SOIL:
                        sb.append('X');
                        break;
                    case WATER:
                        sb.append('~');
                        break;
                    case BEACH:
                        sb.append('.');
                        break;
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
