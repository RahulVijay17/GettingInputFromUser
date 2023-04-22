public class RepeatElement{
    public static void main(String[] args) {
       // int a[]={1,5,10,7,8,1};
       int a[]={1,5,2,5,1,1};

        int temp[]= new int[a.length];

        for(int i=0;i<a.length;i++){
            if(temp[i]==1){
                System.out.println(a[i]);
            }else{
                temp[a[i]]++;
            }
        }
    }
}