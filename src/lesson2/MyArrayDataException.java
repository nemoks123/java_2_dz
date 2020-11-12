package lesson2;

public class MyArrayDataException  extends  NumberFormatException{
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String getMessage() {
        return "Элемент под номером " + i + " " + j + " другого типа";
    }
}
