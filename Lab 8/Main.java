public class Main {
    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.add(new Line());
        picture.add(new Line());
        picture.add(new Line());
        picture.add(new Line());
        picture.add(new Circle());
        picture.add(new Rectangle());
        picture.draw();
        System.out.println();
        Picture rootPicture = new Picture();
        rootPicture.add(picture);
        rootPicture.draw();
    }
}
