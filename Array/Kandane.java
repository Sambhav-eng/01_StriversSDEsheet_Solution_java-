    import java.util.*;

    public class Kandane {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int n = in.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the array elements:");
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            long sum = 0;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                if (sum > max) {
                    max = sum;   // update max if current sum is greater
                }

                if (sum < 0) {
                    sum = 0;     // reset sum if it goes negative
                }
            }

            System.out.println("Maximum Subarray Sum: " + max);
        }
    }
