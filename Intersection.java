import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        Integer arr1[]={4,1,2,3};
        Integer arr2[]={1,4,7,8};
        printIntersection(arr1, arr2);
    }

    public static void printIntersection(Integer[] arr1,Integer[] arr2){
            HashSet<Integer> hashSet = new HashSet<>();
          /*  for(int i=0;i<arr1.length;i++){
                hashSet.add(arr1[i]);
            }
            for(int i=0;i<arr2.length;i++){
                if(hashSet.contains(arr2[i])){
                    System.out.println(arr2[i]);
                }
            } */ //methpd1

            for(Integer array1 : arr1){
                hashSet.add(array1);
            }
            for(Integer array2 : arr2){
                if(hashSet.contains(array2)){
                    System.out.println(array2);
                }
            } //method 2
    }
}
