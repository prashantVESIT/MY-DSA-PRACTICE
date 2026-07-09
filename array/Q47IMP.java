public class Q47IMP {
    /*
     * You are given n pratas that need to be cooked by I cooks. Each
     * cook has arank R which determines how quickly they can cook
     * pratas.
     * 
     *  A cook with rank R takes R minutes to cook the first prata, 2R
     * minutes for the second. 3R minutes for the third, and so on.
     * . Each cook can only prepare one prata at a time.
     * 
     * Your task is to determine the minimum amount of time required to
     * cook all n pratas.
     */
    static boolean isValidAnswer(int[] arr, int totalparathas, int timelimit) {
        // paratha kitne banenge uska count
        int parathaCount = 0;

        // har ek cook ke pass jana h then waha par parathacount inc krna h and check
        // krna h ki timelimit ke aandar hi ban rhe h na
        for (int i = 0; i < arr.length; i++) {
            int currentCookkiRank = arr[i];
            int timeTaken = 0;
            // Rank se number ko multiply bhi karna h na
            int j = 1;
            while ((timeTaken + j * currentCookkiRank) <= timelimit) {

                timeTaken += j * currentCookkiRank;
                parathaCount++;
                j++;

            }
            if (parathaCount >= totalparathas) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        int p = 10;
        int maxi = 0;
        for (int i : arr) {
            if (i > maxi) {
                maxi = i;
            }
        }

        int s = 0;
        // sum of parathas * maxRank of the cook
        int e = maxi * (p * (p + 1) / 2);
        int ans = -1;
        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, p, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);

    }
}
