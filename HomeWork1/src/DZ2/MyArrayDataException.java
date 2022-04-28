package DZ2;

public class MyArrayDataException extends Exception {
    public static String DataMas = "Неверные данные массива";

    public MyArrayDataException() {
        super(DataMas);
    }
}
