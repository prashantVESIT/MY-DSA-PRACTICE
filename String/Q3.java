//  Reverse a string
public class Q3 {
    public static void main(String[] args) {
        String str = "Babbar";
        char arr[]=str.toCharArray();

        int start =0;
        int end = arr.length-1;
        while(end>start){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String str1 = new String(arr);
        System.out.println("Reversed String : "+str1);
    }
}
