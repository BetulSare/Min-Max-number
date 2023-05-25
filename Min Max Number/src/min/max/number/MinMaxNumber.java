
package min.max.number;

import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int numbers=scan.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < numbers; i++) {
            System.out.printf("%s. sayıyı giriniz: ",i+1);
            int number=scan.nextInt();
            if(number>max){
            max=number;
            }
            
            if(number<min){
            min=number;
            }
            
        }
        
        System.out.printf("Max number: %s ",max);
        System.out.printf("\nMin number: %s ",min);

    }
    
}
