package Praktikum.Praktikum_5.de.hsruhrwest.oop.ss2025.classes.Aufgabe_1;

class PoliticalParty {
    private String name;
    private String abbreviation;
    private int foundedYear;
    private String chairperson;
    private String[] members;
    private int memberCount;
    private final int MAX_MEMBERS = 100;

    public PoliticalParty(String name, String abbreviation, int foundedYear, String chairperson, String[] members) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.foundedYear = foundedYear;
        this.chairperson = chairperson;
        this.members = new String[MAX_MEMBERS];
        this.memberCount = 0;
        for (int i = 0; i < MAX_MEMBERS && members[i] != null; i++) {
            this.members[i] = members[i];
            this.memberCount++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getChairperson() {
        return chairperson;
    }

    public void setChairperson(String chairperson) {
        this.chairperson = chairperson;
    }

    public String[] getMembers() {
        String[] result = new String[memberCount];
        for (int i = 0; i < memberCount; i++) {
            result[i] = members[i];
        }
        return result;
    }

    public void setMembers(String[] members) {
        this.members = new String[MAX_MEMBERS];
        this.memberCount = 0;
        for (int i = 0; i < MAX_MEMBERS && members[i] != null; i++) {
            this.members[i] = members[i];
            this.memberCount++;
        }
    }

    @Override
    public String toString() {
        StringBuilder memberList = new StringBuilder("[");
        for (int i = 0; i < memberCount; i++) {
            memberList.append(members[i]);
            if (i < memberCount - 1) {
                memberList.append(", ");
            }
        }
        memberList.append("]");
        return "Politische Partei: Name=" + name + ", Kürzel=" + abbreviation + ", Gründungsjahr=" +
                foundedYear + ", Vorsitzender=" + chairperson + ", Mitglieder=" + memberList.toString();
    }
}
