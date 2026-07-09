public class p5{
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("   ");
            }
            
            if(i==1||i==5){
                for(int j =1;j<=2*i-1;j++){
                    System.out.print(" * ");

                }
            }
            else{
                System.out.print(" * ");

                for(int j =1;j<=2*i-3;j++){
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}