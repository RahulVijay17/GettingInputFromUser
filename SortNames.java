import java.util.Scanner;

public class SortNames {

    public static void main(String[] args) {
        int n;
        String temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of names you want to sort");
        n=scanner.nextInt();
        String names[]=new String[n];
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter the name you want to sort");
        for(int i=0;i<n;i++){
            names[i] =scanner2.nextLine();
        }

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                    if(names[i].compareTo(names[j])>0){
                        temp=names[i];
                        names[i]=names[j];
                        names[j]=temp;
                    }
            }
        }
        for (String name : names) {
            System.out.println("sorted Array = " +name);
            
        }
    }
    
}
