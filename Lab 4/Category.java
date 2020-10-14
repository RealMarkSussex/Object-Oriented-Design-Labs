import java.util.ArrayList;

public class Category {
    private String name;
    private Boolean isRestricted;
    private ArrayList<User> Users;

    public Category(String name, Boolean isRestricted) {
        this.name = name;
        this.isRestricted = isRestricted;
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> users) {
        this.Users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public void addUser(User user) {

    }
}
