import java.util.*;
 class bubblesort{
    static void Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;}}
            }
        static int Search(int[] arr,int k){
        int low=0;
        int high = arr.length -1;
        while(low <= high){
        int mid = high+low/2;
        if(arr[mid] == k){
            return arr[mid];
        }
         else if(arr[mid]< k) {
           low = mid+1;
        }
       else if(arr[mid]>k){
            high = mid-1;
        }
        }
        return -1;
        
    }   
    public static void Print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    
    public static void main(String[] args){
    int[] arr ={1,2,9,8,10};
    Sort(arr);
    
    int s = Search(arr,9);
    
    if(s ==-1){
     System.out.println("Element not found");
    }
    else {
        System.out.println("Element is found at index "+ s);
    }

    Print(arr);
    
    }
}
