import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        int[]array=new int[5];
        System.out.println("enter the elements");
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<array.length-1;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("printing elements before insert");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("enter the location which you want to insert");
        int location=scanner.nextInt();
        System.out.println("enter the value which you want to insert");
        int value=scanner.nextInt();
         
        for(int i=args.length-1;i>location;i--){
            array[i]=array[i-1];
        }
        array[location]=value;

        for (int i : array) {
            System.out.println(i);
        }
    }
}
