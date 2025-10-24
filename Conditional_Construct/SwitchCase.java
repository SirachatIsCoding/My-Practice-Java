import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Scanner kb = new Scanner(System.in);

        // System.out.print("Input name of Months : ");
        // String number = kb.nextLine();

        // switch (number) {
        //     case "January": // if(condition --> number = 1)
        //         System.out.println("January"); 
        //         break;
        //     case "February":
        //         System.out.println("February");
        //         break;
        //     case "March":
        //         System.out.println("March");
        //         break;
        //     default: // else
        //         System.out.println("other months");
        //         break;
        // }
        // kb.close(); 

        String day = "Tuesda".toLowerCase();
        switch (day) {
            case "monday" -> System.out.println("its " + day);
            case "tuesday" -> System.out.println("its " + day);
            case "wednesday" -> System.out.println("its " + day);
            case "thursday" -> System.out.println("its " + day);
            case "friday" -> System.out.println("its " + day);
            case "saturday" -> System.out.println("its " + day);
            case "sunday" -> System.out.println("its " + day);
            default -> System.out.println(day + " this is not a day ;-;");
        }
    }
    
}