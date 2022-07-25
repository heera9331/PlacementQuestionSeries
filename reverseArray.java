
import java.util.Scanner;
class Main {
    static void reverseArray(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n/2; i++) {
            // swap
            int t = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        
        reverseArray(nums);
        for(int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
        
    }
}
