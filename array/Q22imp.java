public class Q22imp {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 8, 5, 6, 10, -1 };

        int[] rs = new int[arr.length];
        int[] ls = new int[arr.length];
        rs[0] = arr[0];
        ls[arr.length - 1] = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            rs[i + 1] = rs[i] + arr[i + 1];

        }
        for (int i = arr.length - 1; i > 0; i--) {
            ls[i - 1] = ls[i] + arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (rs[i] == ls[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
