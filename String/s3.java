public class s3 {
    public static void main(String[] args) {
        String str = "Babbar";
        System.out.println(str.length());//6

        System.out.println(str.charAt(3));//b

        String name = "BABBAR";
        System.out.println(str.equals(name)); //False

        System.out.println(str.equalsIgnoreCase(name));//True

        System.out.println(str.toUpperCase()); // BABBAR
        //It doesnt change the string it is a temporary method to change the case of
        // the word

        System.out.println(name.toLowerCase());// babbar
        //It doesnt change the string it is a temporary method to change the case of
        // the word

        String s3 = " ";
        System.out.println(s3.length());
        System.out.println(s3.isEmpty());
        // It counts the number of spaces too
        System.out.println(s3.isBlank());
        // It checks only for the char of words in the String

        String str1 =" LOVE ";
        System.out.println(str1);// LOVE
        System.out.println(str1.length());//8
        str1=str1.trim();// it returns a string by trimming leading and trailing
        // spaces
        // It is a temporary method; if we have to change the value of the string as
        // by removing the spaces we need to again store it to the original string
        System.out.println(str1);//LOVE
        System.out.println(str1.length());//4

        String str2 = "My name is Prashant";
        System.out.println(str2.substring(3,7));//name
        // Here endingindex is not inclusive but startingindex is inclusive

        System.out.println(str2.contains("name"));
        // It checks whether the sort of string is present or not

        String str3 ="Babbar";
        char []arr=str3.toCharArray();
        // It converts letters of a word into char array

        for(int i =0;i<arr.length;i++){
        System.out.println("Character at index "+i+" is :"+ arr[i]);
        }

        //IMP: .split(" " OR ",")
        // it splits the words in substring depending upon criteria and converts into
        // string array
        //criteria : " " , "," or some seperating words; that is to be mentioned by
        // user

        String str4 = "I am coding in JAVA";
        String [] arr1 = str4.split(" ");

        for(int i =0;i<arr1.length;i++){
        System.out.println(arr1[i]);
        }

        // Concatination
        String s6 = "I am ";
        String s7 = "Prashant Singh";
        System.out.println(s6+s7);

        //conversion to string
        int nums = 5213;
        String s8 = String.valueOf(nums);
        System.out.println(nums+1); // 5214 ; addition
        System.out.println(s8+1); // 52131 ; concatination

        // Startswith and endswith
        String s9 = "I LOVE MYSELF";
        System.out.println(s9.startsWith("I"));
        System.out.println(s9.endsWith("SELF"));

        String s10 = "I MISS YOU SO MUCH";
        char [] a = s10.toCharArray();

        for(char i : a){
        System.out.print(i+" ");
        }

        String s10a = "MY FAVOURITE GAME IS CRICKET";
        String[] words = s10a.split(" ");
        //WAY 1
        for (String s : words) {
            System.out.println(s);
        }
        System.out.println();

        //WAY 2
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }

        // ULTA ARRAY
        for(int i =words.length-1;i>=0;i--){
            System.out.println(words[i]);
        }

        String s11 = "Babbar";
        
        System.out.println(s11.replace("a", "k"));

    }

}

/*
// String name1 = "Love";
        // String name2 = "Love";

        // if (name1 == name2) {
        //     System.out.println("they access the same meomry location");
        // }

        // if (name1.equals(name2)) {
        //     System.out.println("each charater of the strings are same");
        // }

        // String str1 = new String("Prashant");
        // String str2 = new String("pRaShaNt");
        // if (str1.equalsIgnoreCase(str2)) {
        //     System.out.println("they are equal but by ignoring the cases");
        // }

        // // Input 
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(str);
        // str = sc.nextLine();
        // System.out.println(str);

        //Methods
        // String s = new String("Rahul");
        // System.out.println(s.length());
        // System.out.println(s.charAt(3));
        // System.out.println(s.toUpperCase());
        // System.out.println(s);
        // System.out.println(s.toLowerCase());

        // String s2 = "RAHUL";
        // System.out.println(s.equals(s2));
        // System.out.println(s.equalsIgnoreCase(s2));

        // String s3 = "  ";
        // System.out.println(s3.length());
        // System.out.println(s3.isEmpty());
        // System.out.println(s3.isBlank());

        // String s4 = "   LOVE   ";
        // System.out.println(s4);
        // System.out.println(s4.length());
        // s4=s4.trim();
        // System.out.println(s4);
        // System.out.println(s4.length());

        // String s5 = "My name is Prashant singh";
        // for(int i =0;i<s5.length();i++){
        //     System.out.print(s5.charAt(i)+" ");
        // }
        // System.out.println();

        // System.out.println(s5.substring(3,7));
        // System.out.println(s5.contains("name"));
        

        // // Concatination
        // String s6 = "I am ";
        // String s7 = "Prashant Singh";
        // System.out.println(s6+s7);

        // //conversion to string 
        // int nums = 5213;
        // String s8 = String.valueOf(nums);
        // System.out.println(nums+1); // 5214 ; addition
        // System.out.println(s8+1); // 52131 ; concatination

        // Startswith and endswith
        String s9 = "I LOVE MYSELF";
        System.out.println(s9.startsWith("I"));
        System.out.println(s9.endsWith("SELF"));

        String s10a = "MY FAVOURITE GAME IS CRICKET";
        String[] words = s10a.split(" ");
        //WAY 1
        for (String s : words) {
            System.out.println(s);
        }
        System.out.println();

        //WAY 2
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }

        // ULTA ARRAY
        for(int i =words.length-1;i>=0;i--){
            System.out.println(words[i]);
        }

        String s11 = "Babbar";
        System.out.println(s11.replace("a", "k"));







*/ 
