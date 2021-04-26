import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int number = sc.nextInt();
        int count=number;
        int replace = 0;
        for (int j=0; j < number; j++) {
            for (int i = 0; i < count - 1; i++) {
                System.out.print(" ");
            }
            count--;
            if(j >0){
                System.out.print("*");
                for(int i=1; i<=2*j-1; i++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else {
                System.out.print("*");
            }
            System.out.print("\n");
            if (j == number-1){
                int p=2*(j-1)-1;
                int space =1;
                for(int k=1; k<=number-1; k++)
                {
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(count== number-2 )
                break;
            else
            for( int i=0; i<p; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            p=p-2;
            space++;
            count++;
            System.out.print("\n");

        }
            }
    }
  } 
}