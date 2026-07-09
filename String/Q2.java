//Count vowels in the string 
public class Q2 {
    public static void main(String[] args) {
        String str ="Babbar is a boy";
        String str2 = str.toLowerCase();
        int count=0;
        for(int i =0;i<str2.length();i++){
            if(str2.charAt(i)=='a'||
               str2.charAt(i)=='i'||
               str2.charAt(i)=='o'||
               str2.charAt(i)=='e'||
               str2.charAt(i)=='u'){
                count++;


            }
        }
        System.out.println("No. of vowels : "+count);
    }
}
