public class main {
    public static int linearSearch(int[] arr, int key) {
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12,23,34,54,76,45,23,897,56,34};
        int result=linearSearch(arr, 234);
        if(result >= 0) {
            System.out.println("Element found at: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}