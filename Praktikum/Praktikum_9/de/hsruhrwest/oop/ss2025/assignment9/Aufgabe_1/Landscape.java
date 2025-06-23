package Praktikum.Praktikum_9.de.hsruhrwest.oop.ss2025.assignment9.Aufgabe_1;

import java.io.*;

import java.nio.file.Paths;

public class Landscape {

    public enum Tile {
        SOIL,
        WATER,
        BEACH
    }

    public final static String ABSOLUTE_PATH = Paths.get("").toAbsolutePath() + "/Praktikum/Praktikum_9/de/hsruhrwest/oop/ss2025/assignment9/Aufgabe_1/";
    private final int width;
    private final int height;
    private final Tile[][] tiles;

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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setTile(int x, int y, Tile tile) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException("Ungültige Koordinaten: (" + x + ", " + y + "). Sie müssen innerhalb [0, " + (width - 1) + "] für x und [0, " + (height - 1) + "] für y liegen.");
        }
        if (tile == null) {
            throw new IllegalArgumentException("Kachel-Typ darf nicht null sein.");
        }
        this.tiles[y][x] = tile;
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException("Ungültige Koordinaten: (" + x + ", " + y + "). Sie müssen innerhalb [0, " + (width - 1) + "] für x und [0, " + (height - 1) + "] für y liegen.");
        }
        return this.tiles[y][x];
    }

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
