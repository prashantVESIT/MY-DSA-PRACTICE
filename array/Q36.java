public class Q36 {
    // Peak of mountain in an array
    public static void main(String[] args) {
        int [] arr ={0,3,4,5,2,1};
        int s=0;
        int e = arr.length-1;
        int peak =0;
        int peakindex =0;
        while(e>=s){
            int mid = s+(e-s)/2;
            if(arr[mid+1]<arr[mid] && arr[mid-1]<arr[mid]){
                peak= arr[mid];
                peakindex = mid;
                break;
            }
            if(arr[mid+1]>arr[mid]){
                s=mid+1;
            }
            if(arr[mid-1]>arr[mid]){
                e=mid-1;
            }
        }
        System.out.println(peak);
        System.out.println(peakindex);
    }
}
