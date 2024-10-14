package pakett1;

import java.util.Arrays;

public class ex98reverse {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int[] copied = copy(original);

        copied [3] = 99;

        System.out.println("original:" + Arrays.toString(original));
        System.out.println("copied:" + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for ( int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length -1 -i];
        }
        return newArray;
    }
}
