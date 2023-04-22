import java.util.Scanner;

public class MaximumDifferenceArray{
    public static void main(String[] args) {
        int max,min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n= scanner.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        
        max=a[0];
        min=a[0];

        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]< min){
                min=a[i];
            }
        }

        System.out.println("maximum ="+ max);
        System.out.println("minimum ="+ min);
        System.out.println("max diff "+ (max-min));


    }
}