public class seclargest {

        int print2largest(int arr[], int n) 
        {
              int temp =0;
              //Arrays.sort(arr);
              for (int i = 0; i < n; i++)   
                {  
                for (int j = i + 1; j < n; j++)   
                {  
                    if (arr[i] > arr[j])   
                    {  
                        temp = arr[i];  
                        arr[i] = arr[j];  
                        arr[j] = temp;  
                    }  
                }  
            }  
           return arr[n-2];  
        }
    
}
