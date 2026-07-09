public class Q1 {
    // Average of all the elements of an array
    public static void main(String[] args) {
        // Find the avg of all the elements 
        int [] arr = { 1,2,3,6,5};
        double sum =0;
        for(int i : arr){
            sum += i;

        }
        double avg = sum / arr.length;
        System.out.println("Average of all the elements :"+avg);
    }

    // we have traverse all the elements of the array therefore 
    //Time Complexity = O(n);
    // Variables has taken constant space 
    // Space Complexity = O(1);
    
}
