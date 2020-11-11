import java.util.ArrayList;

public class Picture extends Graphic {

    private ArrayList<Graphic> graphics = new ArrayList<>();
    @Override
    public void draw() {
        System.out.println("A picture containing [");
        for (Graphic g : graphics) {
            g.draw();
        }
        System.out.println("]");
    }

	@Override
    public void add(Graphic g) {
        graphics.add(g);
    }

    @Override
    public void remove(Graphic g) {
        graphics.remove(g);
    }

    @Override
    public Graphic getChild(int index) {
        return graphics.get(index);
    }
    
}
