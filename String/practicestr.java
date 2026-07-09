import java.util.*;

public class practicestr {
    public static void main(String[] args) {
        String str = "NITIN";
        String s1 = str;

        char [] ch = str.toCharArray();
        int n = ch.length;
        for(int i =0;i<n/2;i++){
            char temp = ch[i];
            ch[i] = ch[n-1-i];
            ch[n-1-i] = temp;
        }
        
        String s2 = new String(ch);
        System.out.println(s2);

        if(s1.equals(s2)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }

        //Reverse a string
        // String [] s = str.split(" ");
        // int n = s.length;
        // for(int i = 0;i<n/2;i++){
        //     String temp = s[i];
        //     s[i] = s[n-1-i];
        //     s[n-1-i] = temp;
        // } 

        // for(String word : s){
        //     System.out.print(word+" ");
        // }


        //reverse a word 

        // String str2 = "Babbar";
        // char [] ch = str2.toCharArray();
        // int n = ch.length;

        // for(int i = 0;i<n/2;i++){
        //     char temp = ch[i];
        //     ch[i] = ch[n-1-i];
        //     ch[n-1-i] = temp;
        // }

        // for(char c : ch){
        //     System.out.print(c+" ");
        // }
        





        // int count =0;
        // char [] ch = str.toCharArray();
        // for(int i =0;i<ch.length;i++){
        //     if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
        //         count++;
        //     }
            
        // }
        // System.out.println(count);

        // // M1
        // for (int i = 0; i < str.length(); i++) {
        //     System.out.print(str.charAt(i) + " ");
        // }
        // System.out.println();

        // // M2
        // char[] ch = str.toCharArray();
        // for (int i = 0; i < ch.length; i++) {
        //     System.out.print(ch[i] + " ");
        // }



    }

}
