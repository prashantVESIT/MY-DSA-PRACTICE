public class Q9 {
    //CONTAINER WITH MOST WATER
    public static void main(String[] args){
        int [] heights = {1,8,6,2,5,4,8,3,7};
        int n = heights.length;
        int s = 0;
        int e = n-1;
        int maxarea=0;
        while(e>s){
            int width = e-s;
            int height=Math.min(heights[s],heights[e]);
            int area = width * height;
            if(area>maxarea){
                maxarea = area;
            }
            if(heights[s]<heights[e]){
                s++;
            }
            else{
                e--;

            }

        }
        System.out.println(maxarea);
    }
}
