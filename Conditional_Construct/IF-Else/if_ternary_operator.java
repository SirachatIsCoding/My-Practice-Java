import java.util.Scanner;

public class if_ternary_operator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("numbers : ");
        int number = kb.nextInt();
                                    
        String result;
        // variable = (condition) ? true : false
        result = number%2 == 0 ? "number is even" : "number is odd";
        System.out.println(result);

        kb.close();
    }
}
