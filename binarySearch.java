public class binarySearch{
     static int binarySearch(int[] arr, int n,int k){
         int l=0;
         int h=n-1;
         while(l<=h){
             int mid=(l+h)/2;
             if(arr[mid]==k){
                 return mid;
             }
             if(arr[mid]<k){
                 l=mid+1;
             }
             else{
                 k=mid-1;
             }
         }
         return -1;
     }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,15,18,20,24,54,85};
        int k=25;
        int ans= binarySearch(arr,10,k);
        System.out.println(ans);
    }

    }
