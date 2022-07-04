//using iterative approach
public class reverseArray {
    static void reverse(int arr[],int start,int end){   //function to reverse the array
        int temp;
        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size){  //function to print the array
        for(int i=0; i < size; i++){
            System.out.println(arr[i]+"");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,6,5,8,98,78,45};
        printArray(arr,7);
        reverse(arr,0,6);
        System.out.println("reversed array is\n");
        printArray(arr,7);
    }

    }

