public class a2d2 {
    // jacked array 
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5},{6,7,8,9},{10}};
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
// rowlength=arr.length
//colength=arr[0].length--> (only when column length is fixed in a 2D array)koi bhi ek row par jao and uska column lenght utha lo here row[0]
//-->(when col is variable);jacked array
// colenght=arr[i].length-->(jo row h uske index par jaake uska col length utha lo )