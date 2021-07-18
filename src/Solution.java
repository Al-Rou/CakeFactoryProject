import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int solution(int N, int K, int[] A, int[] B, int[] C)
    {
        List<Stack<Integer>> list = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            Stack<Integer> stack= new Stack<>();
            list.add(stack);
        }
        for(int i = 0; i < C.length; i++)
        {
            if(A[i] > B[i])
            {
                System.out.println("Error in values of A and B, index " + i);
                break;
            }
            for(int j = A[i]; j <= B[i]; j++)
            {
                list.get(j-1).push(C[i]);
            }
        }
        for(int i = K; i > 0; i--)
        {
            for(int j = 0; j < list.size(); j++)
            {
                if(list.get(j).isEmpty())
                {
                    list.remove(j);
                    if(list.size() == 0)
                    {
                        return 0;
                    }
                    j--;
                    continue;
                }
                int valueCheck = list.get(j).pop();
                if(valueCheck != i)
                {
                    list.remove(j);
                    if(list.size() == 0)
                    {
                        return 0;
                    }
                    j--;
                }
            }
        }
        return list.size();
    }
}
