public class CakeFactory {

    public static void main(String[] args)
    {
        Solution s = new Solution();
        /*//First Test Case
        int N = 5;
        int K = 3;
        int[] A = {1, 1, 4, 1, 4};
        int[] B = {5, 2, 5, 5, 4};
        int[] C = {1, 2, 2, 3, 3};
        //The answer is 3 */

        /*//Second Test Case
        int N = 6;
        int K = 4;
        int[] A = {1, 2, 1, 1};
        int[] B = {3, 3, 6, 6};
        int[] C = {1, 2, 3, 4};
        //The answer is 2 */

        /*//Third Test Case
        int N = 3;
        int K = 2;
        int[] A = {1, 3, 3, 1, 1};
        int[] B = {2, 3, 3, 1, 2};
        int[] C = {1, 2, 1, 2, 2};
        //The answer is 1 */

        //Fourth Test Case
        int N = 5;
        int K = 2;
        int[] A = {1, 1, 2};
        int[] B = {5, 5, 3};
        int[] C = {1, 2, 1};
        //The answer is 3 */
        System.out.println(s.solution(N, K, A, B, C));
    }
}
