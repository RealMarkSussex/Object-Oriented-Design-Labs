import java.util.ArrayList;

public class Forum {
    private String name;
    private boolean loginRequired;
    private ArrayList<User> users;
    private ArrayList<Thread> threads;

    public Forum(String name, boolean loginRequired) {
        this.setName(name);
        this.setLoginRequired(loginRequired);
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }

    public void setThreads(ArrayList<Thread> threads) {
        this.threads = threads;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(boolean loginRequired) {
        this.loginRequired = loginRequired;
    }

    public void registerUser(String username, String password) {

    }

    public void removeUser(User userToRemove) {

    }

    public void createNewThread(String title, Post initialPost) {

    }

}
