import java.util.*;
public class oddEven {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : - ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("given number is a even number");
        }
        else{
            System.out.println("given number is odd number");
        }
    }
}
