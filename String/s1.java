// == : it check at which memory location the objects are pointing, into the String pool  
//--> output is true if it points 
// .equals : it checks each and every char of string are same 
//--> it is case sensitive ; output is true if all the chars of strings are equal
//.equalsIgnoreCase : it compares ignoring the case of the word 

public class s1 {
    public static void main(String args[]) {
        String str1 = "Love";
        String str2 = "Love";
        String str3 = "LOVE";
        if (str1 == str2) {
            System.out.println("strings are equal ==");
        }
        if (str1.equals(str2)) {
            System.out.println("Strings are equal .equals");

        }
        if(str1.equalsIgnoreCase(str3)){
            System.out.println("Strings are equals by ignoring the case ");
        }
    }
}
