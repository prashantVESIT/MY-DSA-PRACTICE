// LCM and GCD of two numbers
public class maths8 {

    int gcdofnumber(int a,int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        return ans;
    }
    int lcmofnumber(int a,int b){
        int gcd = gcdofnumber(a,b);
        System.out.println("GCD of two numbers:"+gcd);
        int ans = (a*b)/gcd;
        return ans;

    }
    public static void main(String[] args) {
        maths8 m1 = new maths8();
        int LCM = m1.lcmofnumber(15,45);
        System.out.println("LCM of two numbers:"+LCM);
    }
}
