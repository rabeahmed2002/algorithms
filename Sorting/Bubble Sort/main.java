public class Main {
    public static void swap(int[] array, int a, int b) {
        int tmp=array[a];
        array[a]=array[b];
        array[b]=tmp;
    }

    public static void bubbleSort(int[] array) {
        int n=array.length;
        for(int i=0; i < n-1; i++) {
            for(int j=0; j< n-i-1; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, array[j], array[j+1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array={1,3,2,4,6,5};
        bubbleSort(array);
    }
}