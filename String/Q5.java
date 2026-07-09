// Count the length of the string without using .length()

public class Q5 {
    public static void main(String[] args) {
        String str ="Babbar";
        System.out.println(str);
        int count = 0;
        char [] arr = str.toCharArray();

        for(int i =0;i<arr.length;i++){
            count++;
        }
        System.out.println("Length:"+count);

    }
}
