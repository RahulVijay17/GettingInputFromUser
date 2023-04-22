import java.util.Arrays;

public class ExtractFirstLetter {
    public static void main(String[] args) {
        String str = "I am Rahul";
        splitWords(str);
    }

    private static void splitWords(String str) {
       String words[] = str.split(" "); //it will convert into array of Strings
      // System.out.println(Arrays.toString(words));
      for(int i=0;i<words.length;i++){
        String s = words[i];
        System.out.println( s.charAt(0));
      }
    }
}
