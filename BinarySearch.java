public class BinarySearch {
    public static void main(String[] args) {
        int a[]={10,20,30,50,100};
        int searchElement=10;
      int index =  binarySearch(a,0,a.length-1,searchElement);
      System.out.println("element found at index "+index);
    }

    private static int binarySearch(int[] a, int low, int high, int searchElement) {
        if(high>=low){
            int mid=low+((high-low)/2);
            if(a[mid]==searchElement){
                return mid;
            }
            if(searchElement>a[mid]){
             return   binarySearch(a, mid+1,high,searchElement);

            }
            if(searchElement<a[mid]){
              return  binarySearch(a, low, mid-1, searchElement);
            }
        }

        return -1;
    }
}
