public class BWQ2 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,3,5,2,1};
        int xor =0;
        for(int i : arr){

            xor ^=i;
            //now the XOR value is stored in the variable xor


        }
        //now lets find the unique setbit where 4 and 5 gets differ
        //it means we have to find last set bit 
        //Logic 
        int setBit = ((xor) & (-(xor)));
        int unique1=0;
        int unique2=0;

        // by using this bit we will split the elements in two groups 
        for(int i : arr){
            if((i & setBit) !=0){
                unique1 ^=i;


            }
            else{
                unique2 ^=i;
            }
        }

        System.out.println(unique1);
        System.out.println(unique2);


    }
    
}
