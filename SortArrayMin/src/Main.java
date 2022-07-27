import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Double arr[] = new Double[]{1.0d,4.0d,12.0d,7.0d,25.0d,3.0d,100.0d};
        int k = 3;

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k + " smallest elements of the said array are:");
        Arrays.sort(arr);
        for(int i = 0; i < k; i++){
            System.out.println(arr[i] + " ");
        }
    }
}