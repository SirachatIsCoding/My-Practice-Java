import java.util.Scanner;

public class Convert_value {    
    public static void main(String[] args) {
        
        // Windening Casting -> small bit to bigger bit, Narrowing Casting -> big bit to smaller bit.
        // byte a = 100; {-128 to 127} --> 8 bit
        // short a = 30000; {-32768 to 32767} --> 16 bit
        // char a = 'G'; {single character 'a', 'A'} --> 16 bit
        // int a = 10; {-2,147,483,648 to 2,147,483,647} -->> 32 bit
        // long a = 10000000000; {-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807} --> 64 bit
        // float a = 10.123456f; {~±3.4×10^38} --> 32 bit 
        // double a = 10.321654; {~±1.8×10^308} --> 64 bit

        Scanner sc = new Scanner(System.in);

        // Windening Casting
        System.out.println("------------- Windening Casting -------------");
        int num1 = 100;
        double num2 = num1 + 20.33;
        System.out.println("num1 is " + num1 + " and " + "num2 is " + num2);

        // char convert to int (ascii code) #windening casting
        System.out.println("------------- char to int (ascii) -------------");
        char  ch = 'H';
        int n = (int)ch;
        System.out.println("char to int(ascii) : " + n);

        // Narrowing Casting
        System.out.println("------------- Narrowing Casting -------------");
        float num3 = 50.23566f;
        int num4 = (int)num3;
        System.out.println("num3 is " + num3 + " and " + "num4 is " + num4);

        // String convert to data typte
        System.out.println("------------- String to char -------------");
        String S1 = "Bogie";
        char[] C1 = S1.toCharArray(); // return char array [B, o, g, i ,e]
        System.out.println("temp #1 : " + C1[0]); 
        char C2 = S1.charAt(1); 
        System.out.println("temp #2 : " + C2);  

        System.out.println("------------- String to int -------------");
        String S2 = "123456";
        int StoInt = Integer.parseInt(S2);
        System.out.println(StoInt + 4);

        System.out.println("------------- String to float -------------");
        System.out.print("input for string(float) : ");
        //Scanner sc = new Scanner(System.in);
        String S3 = sc.nextLine();
        float f1 = Float.valueOf(S3);
        System.out.println("output : " + (f1 + 5.02));
        
        // char convert to string
        System.out.println("------------- char to String -------------");
        char[] name = {'b', 'o', 'g', 'i', 'e'};
        String result = String.valueOf(name);
        System.out.println(result);

        // int convert to string
        System.out.println("------------- int to String -------------");
        System.out.print("input for string(int) : ");
        //Scanner sc1 = new Scanner(System.in);
        int num5 = sc.nextInt();
        String S4 = String.valueOf(num5);
        S4 += 10+20;
        System.out.println("output : " + S4);
        
        // int convert to char (ascii)
        System.out.println("------------- int to char (ascii) -------------");
        int n1 = 76; 
        char ch1 = (char)n1;
        System.out.println("int to char : " + ch1);

        sc.close();
    }
}
