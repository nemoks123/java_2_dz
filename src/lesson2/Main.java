package lesson2;

public class Main {
    public static void main(String[] args) {

        try {
        String[][] a = {
            {"1","4","5","6"},
            {"5","4","3","2"},
            {"5","1","3","2"},
            {"5","4","3","2"}
        };
            System.out.println("Сумма всех элементов массива = " + Massiv(a));
        }catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

    }
    static int Massiv(String[][] a) throws MyArraySizeException,MyArrayDataException{
        int sum=0;
        if(a.length ==4 ) {
            for (int i = 0; i < a.length; i++) {
                    if(!(a[i].length == 4)) throw new MyArraySizeException(a);
            }
        }else throw new MyArraySizeException( a);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try{
                    sum += Integer.parseInt(a[i][j]);
                }catch (NumberFormatException e){
                   throw new MyArrayDataException( i,j);
                }

            }
        }
        return sum;
    }
}
