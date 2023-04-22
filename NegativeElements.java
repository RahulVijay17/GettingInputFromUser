public class NegativeElements {
    public static void main(String[] args) {
        int[] a={-1,-20,30,40,50,-8};
        int newArr[]=new int[a.length];
        rearrange(a,newArr);
        print(newArr);

    }

    private static void print(int[] newArr) {
        for (int i : newArr) {
            System.out.println(i);
        }

    }

    private static void rearrange(int[] a, int[] newArr) {
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                newArr[j]=a[i];  //no viceversa
                j++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                newArr[j]=a[i];
                j++;
            }
        }
    }
}
