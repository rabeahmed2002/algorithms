public class Main {
    public static int binarySearch(int arr[], int key) {
        int left=0, right=arr.length -1;
        while(left <= right) {
            int mid= left + (right-left)/2;

            if(arr[mid] == key) {
                return mid+1;
            } else if (arr[mid] < key) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    int[] arr = {21,32,43,54,65,76,87,98};
    int result=binarySearch(arr, 54);

    if (result != -1) {
        System.out.println("Element found at index: " + result);
    } else {
        System.out.println("Not found");
    }
}

}
