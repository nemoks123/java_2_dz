package lesson1;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public void doit(Participant p) {
        p.jump(height);
    }
}
