package dp;

public class BalancedPartition {
    private static boolean done = false;
    public static void main(String args[] ) throws Exception {
        int[] arr = {4, 1, -5, 6, -11, 3};
        printBalPartition(arr);
        //printBalPartitionDp(arr);
    }
    
    private static void printBalPartitionDp(int[] arr) {
    
    }
    
    private static void printBalPartition(int[] arr) {
        _printBalPartition(arr, 0);
    }
    
    private static void _printBalPartition(int[] arr, int idx) {
        if (done == true)
            return;

        if (idx == arr.length) {
            printBalPart(arr);
        }
        
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            _printBalPartition(arr, idx + 1);
            swap(arr, idx, i);
        }    
    }
    
    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    
    private static void printBalPart(int[] arr) {
        int sec = arr.length / 2;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < sec; i++)
            sum1+=arr[i];
        
        for (int i = sec; i < arr.length; i++)
            sum2+=arr[i];
        
        if (sum1!= sum2)
            return;
        else 
            done = true;
            
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
