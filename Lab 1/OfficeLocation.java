public class OfficeLocation {
    private String building;
    private String room;

    public OfficeLocation(String building, String room) {
        this.building = building;
        this.room = room;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return building + " " + room;
    }
}