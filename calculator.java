import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value : ");
        int a = sc.nextInt();
         System.out.print("enter second value : ");
        int b = sc.nextInt();
         System.out.print("add +, sub -, mul *, div /, rem % : ");
        char operator = sc.next().charAt(0);
         
        switch (operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);

            sc.close();
        }


    }
}
