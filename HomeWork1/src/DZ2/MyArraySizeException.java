package DZ2;

public class MyArraySizeException extends Exception {
    public static String str = "Неверный размер массива";

    public  MyArraySizeException(){
        super(str);
    }


}
