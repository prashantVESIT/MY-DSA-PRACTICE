import java.util.*;
//**************************************************
// Remove Duplicates from sorted array and print length of new array if the duplicates have been removed 
// {1,2,2,3,3,3,4}

public class Q20 {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 4, 1, 5, 6, 4 };
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            }
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
                j++;
            }
            

        }

        System.out.println("Length: " + (i + 1));

    }
}
