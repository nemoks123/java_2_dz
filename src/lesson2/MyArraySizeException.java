package lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private String[][] arr;

    public MyArraySizeException(String[][] arr) {
        this.arr = arr;
    }

    public MyArraySizeException(String s, String[][] arr) {
        super(s);
        this.arr = arr;
    }

    public String[][] getArr(){
        return arr;
    }

    @Override
    public String getMessage() {
        return "Массив имеет кривой размер ";
    }
}
