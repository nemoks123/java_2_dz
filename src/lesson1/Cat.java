package lesson1;

public class Cat implements Participant {

    private String name;
    private int limitationRun;
    private int limitationJump;
    private boolean attempt;

    public Cat(String name, int limitationRun, int limitationJump) {
        this.name = name;
        this.limitationRun = limitationRun;
        this.limitationJump = limitationJump;
        this.attempt = true;
    }


    @Override
    public void run(int distance) {
        if(distance >= limitationRun) {
            attempt = false;
            System.out.println("Cat: " + name + " can't run "  +distance + "м. и выбыл");
            return;
        }
        System.out.println("Cat: " + name + " run " +distance + "м.");
    }

    @Override
    public void jump(int height) {
        if(height >= limitationJump) {
            attempt = false;
            System.out.println("Cat: " + name + " can't jump " + height + "м. и выбыл");
            return;
        }
        System.out.println("Cat: " + name + " jump "  + height+ "м.");
    }



    @Override
    public boolean isAttempt() {
        return attempt;
    }
}
