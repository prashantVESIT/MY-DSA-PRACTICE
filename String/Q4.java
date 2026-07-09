//check weather the string is palindrome or not 
public class Q4 {
    public static void main(String[] args) {
        String str = "Babbar";
        str = str.toLowerCase();
        char arr[]=str.toCharArray();

        int start = 0;
        int end = arr.length-1;
        while(end>start){
            char temp =arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        String str2 = new  String(arr);
        if(str.equals(str2)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
