public class Q17 {
    //Find an unique element in an array
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,1,3};
        int result=0;
        for(int i : arr){
            result^=i;
        }
        System.out.println("Unique Element: n"+result);
    }
}
