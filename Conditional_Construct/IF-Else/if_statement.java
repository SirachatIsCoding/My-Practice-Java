import java.util.Scanner;

/**
 * thinking in -->> if statement
 */
class if_statement {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        // input your age (single if)
        System.out.print("Input your age : ");
        int age = kb.nextInt();
        if (age >= 18) {
            System.out.println("YOU ARE ADULT");
        }else
            System.out.println("YOU ARE CHILD"); 

        // input how tall are you (if-else if-else)
        System.out.print("Input your height : ");
        int height = kb.nextInt();
        if (height >= 170 ) {
            System.out.println("YOU ARE TALL");
        }else if (height >= 160) {
            System.out.println("YOU ARE NORMAL SIZE");
        }else if (height >= 150) {
            System.out.println("YOU ARE SHORT ");
        }else
            System.out.println("YOU ARE NOT HUMAN ANYMORE");
        
        // nested if
        System.out.print("wanna do nested if ? then press '2' : ");
        int choice = kb.nextInt();
        if (choice == 2) {
            System.out.println("ok! let's do nested if!!");
                
            System.out.print("input your age : ");
            int age_nf = kb.nextInt();    

            if (age_nf >= 18) {
                if(age_nf >= 60) {
                    System.out.println("you are too old");
                }else
                    System.out.println("you are adult");  
            }else
                System.out.println("you are still a child");
        }
        kb.close();
    }    
}
