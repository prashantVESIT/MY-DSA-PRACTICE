public class Q21 {
// Find first repeating element in an array
    public int removeduplicate(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = { 10, 2, 5, 3, 4, 1, 5, 0, 3, 4 };
        Q21 a = new Q21();
        System.out.println(a.removeduplicate(arr));
    }
}

// Time complexity : O(n^2)
