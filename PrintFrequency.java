import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PrintFrequency {
    public static void main(String[] args) {
        
        String s = "Banana";
        HashMap<Character,Integer> hashMap =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            Integer value = hashMap.get(c);
            if(value!=null){
                hashMap.put(c,(value+1));
            }else{
                hashMap.put(c, 1);
            }
        }
        Set<Entry<Character,Integer>> set = hashMap.entrySet();
        List<Entry<Character,Integer>> list = new ArrayList<>(set);

        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {

            @Override
            public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());                
            }
        });
        for(Entry<Character,Integer>entry:list){
            System.out.println("the frequency of occuracy of " + entry.getKey() + " " +entry.getValue());
        }
    }
}
