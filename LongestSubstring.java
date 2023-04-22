import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
            String str = "abcdab";
          System.out.println( longest(str)); 
    }

    private static String longest(String str) {

        HashSet<Character> hashSet = new HashSet<>();
        String longestOverall ="";
        String longestTillNow="";
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hashSet.contains(ch)){
                longestTillNow = "";
                hashSet.clear();
            }
            hashSet.add(ch);
            longestTillNow+=ch;

            if(longestTillNow.length()>longestOverall.length()){
                longestOverall=longestTillNow;
            }

        }
        return longestOverall;
    }

}
