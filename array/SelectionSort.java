public class SelectionSort {
    // Selection sort:
    // It takes minimum element and place on its exact position
    // Algortihm 1 nested loop outer responsible for no. of rounds
    // innner loop compares minivalue (initially at i) with every element of the
    // array and placing the minimum element at its required position
    public static void main(String[] args) {
        int[] arr = { 9, 3, 7, 4, 8, 2, 1, 5, 6 };
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        for(int i :arr){
            System.out.print(i+" ");
        }

    }
}
