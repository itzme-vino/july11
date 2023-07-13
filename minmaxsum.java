import java.util.*;
public class minmaxsum{
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        int max=A.get(0);
        int min =A.get(n-1);
        
        return max+min;
        
        
    }
}
