import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int solution(int N, int K, int[] A, int[] B, int[] C)
    {
        List<Stack<Integer>> list = new ArrayList<>();
        //Create stacks as many as N determines, and store them in a list
        for(int i = 0; i < N; i++)
        {
            Stack<Integer> stack= new Stack<>();
            list.add(stack);
        }
        //Values from C are pushed inside stacks according to the order determined by A and B
        for(int i = 0; i < C.length; i++)
        {
            if(A[i] > B[i])
            {
                System.out.println("Error in values of A and B, index " + i);
                return 0;
            }
            for(int j = A[i]; j <= B[i]; j++)
            {
                list.get(j-1).push(C[i]);
            }
        }
        //If poped values are not in order (from K to 1), remove that stack from the list, since it is not
        //a good cake!
        for(int i = K; i > 0; i--)
        {
            for(int j = 0; j < list.size(); j++)
            {
                //If one stack is empty before i reaches 1, it means that stack does not
                //represent a good cake, hence removed from the list!
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
        //The size of the list shows the answer
        return list.size();
    }
}
