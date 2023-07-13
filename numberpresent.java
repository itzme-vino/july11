public class numberpresent {
        
    static int search(int arr[], int N, int X)
    {
        int k =0;
        int i;
        
        // Your code here
        for(i=0;i<N;i++)
        {
            k=i;
            if(arr[i]==X)
            {
                break;
            }
        }
        if(i==N)
        {
            k=-1;
        }
        return k;
        
    }
    
}
