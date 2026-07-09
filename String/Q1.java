//Print ecah character of the string
public class Q1 {
    public static void main(String[] args) {
        String str ="Babbar is a boy";
        char arr[]=str.toCharArray();

        for(int i =0;i<arr.length;i++){
            System.out.println("Char at index "+i+" : "+arr[i]);
        }
    }
}
