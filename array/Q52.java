public class Q52 {
    public static void main(String[] args) {
        int [] arr = new int [1000];
        int n = 1;
        for(int i=0 ; i<arr.length;i++){
            arr[i]=n*10;
            n++;

        }
        int target = 320;
        if(arr[0]==target){
            System.out.println(arr[0]);
        }

        int i =1;

        while(arr[i]>0){
            if(arr[i]>target){
                break;
            }

            i= i*2;
        }
        int s = i/2;
        int e = i;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]<target){
                s = mid + 1;
            }
            else if (arr[mid]>target){
                e = mid - 1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }


    }
}
