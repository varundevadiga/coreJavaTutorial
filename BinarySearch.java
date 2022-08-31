public class BinarySearch {
     private final int []array;
     private final int key;

    public BinarySearch(int[] array, int key) {
        this.array = array;
        this.key = key;
    }
    public void performBinarySearch() {
        int low = 0;
        int high = array.length - 1;
        int mid = ((low + high) / 2);
        while(low != -1 ) {
            if(key == array[mid]) {
                System.out.println("element found at location " + mid + " and  the element is " + array[mid]);
                System.exit(0);
            }
            else if(key < array[mid]) {
                high = mid - 1;
                mid = ((low + high) / 2) ;

            }
            else if(key > array[mid]) {
                low = mid + 1;
                mid = ((low + high) / 2);
            }
        }
    }
}
