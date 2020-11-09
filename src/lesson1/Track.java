package lesson1;

public class Track implements Obstacles {
    private int length;

    public Track(int length) {
        this.length = length;
    }


    @Override
    public void doit(Participant p) {
        p.run(length);
    }
}
