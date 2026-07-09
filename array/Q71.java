public class Q71 {
    // Product of array except self
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] leftpro = new int[arr.length];
        int[] rightpro = new int[arr.length];
        int [] ans = new int [arr.length];

        leftpro[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            leftpro[i] = leftpro[i - 1] * arr[i - 1];

        }


        rightpro[arr.length-1]=1;
        for(int i = arr.length-2;i>=0;i--){
            rightpro[i]=rightpro[i+1]*arr[i+1];
            
        }

        for(int i =0;i<arr.length;i++){
            ans[i] = leftpro[i]* rightpro[i];
        }

        for(int i : ans){
            System.out.print(i+" ");
        }

        

    }
}
