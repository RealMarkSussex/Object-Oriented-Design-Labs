public class OfficeLocation {
    private String building;
    private String room;

    public OfficeLocation(String building, String room) {
        this.building = building;
        this.room = room;
    }

    @Override
    public String toString() {
        return building + " " + room;
    }
}