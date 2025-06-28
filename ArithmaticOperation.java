import java.util.Scanner;
public class ArithmaticOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("First number");
        int noOne= sc.nextInt();

        System.out.println("Second number");
        int secondOne= sc.nextInt();


        int add = noOne + secondOne;
        int substract = noOne - secondOne;
        int multiply = noOne * secondOne;
        int division = noOne / secondOne;

        System.out.println("addition values : "+ add); // 30
        System.out.println("substraced values : "+ substract); // 10
        System.out.println("multiplication values : "+ multiply); // 200
        System.out.println("division values : "+ division); // 2
        




    }

    
}
