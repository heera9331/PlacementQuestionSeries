import java.util.Scanner;
class Main {
    static void getMaxMin(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i : nums) {
            if(min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        getMaxMin(nums);
    }
}

