import java.util.Arrays;

public class ReverseArray {
    public int[] reverseArray(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[array.length];
        for (int i = array.length; i > 0; i--) {
            newArray[array.length - i]
                    = array[i - 1];
        }
        return newArray;
    }
    //zmiany w kodzie:
    //1) usunieto metode main
    //2) caly kod klasy zapisano do metody, ktora bedzie testowana
    //3) usunieto Scaner, bo w tescie nie jest potrzebny
}
