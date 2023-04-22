import java.util.HashSet;
import java.util.TreeSet;

public class missingnumbersDemo {
    public static void main(String[] args) {
        Integer[] a = {2,4,1,5,7,8,30};
        missingNumbers(a);
    }

    public static void missingNumbers(Integer a[]){
        TreeSet<Integer> set = new TreeSet<>();

        for(Integer num : a){
            set.add(num);
        }
        int small = set.first();
		int large = set.last();
        
     //   int n = a.length+1;

        for(int i=small;i<=large;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
    
}
