import java.util.Scanner;

public class Exception010 {

    public static void main(String[] args) {
        try { // ลองทำดูก่อน
            int a = 10, b = 2;
            int c = a / b;
            System.out.println("c is " + c);

            int[] number = { 10, 20, 30 };
            System.out.println(number[20]);

        } catch (ArithmeticException e) { //ถ้าเกิด error จะทำคำสั่งนี้
            System.out.println("do not divine with 0");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // ไม่ว่ายังไงก็ทำคำสั่งนี้แน่นอน 100%
            System.out.println("Hello nikka ");
        }

        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Age? : ");
            int age = kb.nextInt();
            if (age < 0) {
                System.out.println("eh? how can it be that humans can have ages less then 0");
            }
            kb.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}