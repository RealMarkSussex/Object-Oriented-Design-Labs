public class Lecturer extends Person {
    private int staffId;
    private OfficeLocation officeLocation;

    public Lecturer(String name, int staffId) {
        super(name);
        System.out.println("Lecturer Constructor");
        this.staffId = staffId;
    }

    public Lecturer(String name, int staffId, OfficeLocation officeLocation) {
        super(name);
        System.out.println("Lecturer Constructor");
        this.staffId = staffId;
        this.officeLocation = officeLocation;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public OfficeLocation getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(OfficeLocation officeLocation) {
        this.officeLocation = officeLocation;
    }

    @Override
    public String getName() {
        return super.getName() + " the lecturer.";
    }
}