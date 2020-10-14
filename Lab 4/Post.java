public class Post {
    private String text;

    public Post(String text) {
        setText(text);;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text.length() > 0) {
            this.text = text;
        }
    }

    public String quote() {
        return "";
    }

}
