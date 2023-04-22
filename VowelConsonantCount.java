public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "rahul";
        countVowels(str);
    }

    private static void countVowels(String str) {
        int vowelCount=0;
        int consonantCount=0;

        for(int i=0;i<str.length();i++){
            if(isvowel(str.charAt(i))){
                ++ vowelCount;
            }else{
                ++consonantCount;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);
    }

    private static boolean isvowel(char ch) {
        ch=Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch =='I' || ch=='O' ||ch=='U');
    }
}
