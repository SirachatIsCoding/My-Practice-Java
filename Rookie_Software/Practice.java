import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        SummationAll.run();
        
    }

    static class BMIcalculate {
        static void run(){
            Scanner kb = new Scanner(System.in);
            System.out.print("Input weight : ");
            double weight =  kb.nextDouble();
            System.out.print("Input height : ");
            double height =  kb.nextDouble();

            height = height/100; // convert cm -> m
            double MBI = weight / (height * height);    

            System.out.printf("Your MBI is : %.2f", MBI);
            kb.close();
        }    
    }

    static class ExchangeCash {
        static void run(){
            Scanner kb = new Scanner(System.in);
            System.out.println("********* Exchange Cash Program *********");
            System.out.print("Input Money : ");
            int money = kb.nextInt();

            // 1000 500 100 50 20 10 5 2 1
            if (money >= 1000) {
                System.out.println("get " + (money/1000) + " 1000 bath banknote ");     
                money %= 1000;
            }
            if (money >= 500) {
                System.out.println("get " + (money/500) + " 500 bath banknote ");     
                money %= 500;
            }
            if (money >= 100) {
                System.out.println("get " + (money/100) + " 100 bath banknote ");     
                money %= 100;
            }
            if (money >= 50) {
                System.out.println("get " + (money/50) + " 50 bath banknote ");     
                money %= 50;
            }
            if (money >= 20) {
                System.out.println("get " + (money/20) + " 20 bath banknote ");     
                money %= 20;
            }
            if (money >= 10) {
                System.out.println("get " + (money/10) + " 10 bath banknote ");     
                money %= 10;
            }
            if (money >= 5) {
                System.out.println("get " + (money/5) + " 5 bath coin");     
                money %= 5;
            }
            if (money >= 2) {
                System.out.println("get " + (money/2) + " 2 bath coin");     
                money %= 2;
            }
            if (money >= 1) {
                System.out.println("get " + (money/1) + " 1 bath coin");     
            }
            kb.close();
        }
    }

    static class TemperatureCalculater {
        static void run(){
            Scanner kb = new Scanner(System.in);
            
            System.out.println("***** choose temperature that you want to convert *****");
            System.out.println("Press : C --> for celcius");
            System.out.println("Press : F --> for fahrenheit");
            System.out.print("PRESS AREA : ");
            String st = kb.nextLine();
            char chr = st.charAt(0);

            if (chr == 'c' || chr == 'C') {
                System.out.println("----- Celcuis Calculate -----");
                System.out.print("°F = ");
                double fah = kb.nextDouble();

                double celc = (fah - 32) * 5 / 9;

                System.out.println("°C = " + celc + " °C");
            }
            if (chr == 'f' || chr == 'F') {
                System.out.println("----- Fahrenheit Calculate -----");
                System.out.print("°C = ");
                double celc = kb.nextDouble();  

                double fah = (celc * 9 / 5) + 32;   

                System.out.println("°F = " + fah + " °F");  
            }
            kb.close();
        }
    }

    static class CreateStars {
        static void run(){
            Scanner kb = new Scanner(System.in);
            System.out.print("input how many line of stars u want : ");
            int num = kb.nextInt();
            
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.err.print("*");
                }
                System.out.println("");
            }
            kb.close();
        }
    }
    
    static class SummationAll {
        static void run(){
            Scanner kb = new Scanner(System.in);
            System.out.println("==== starting program ====\n");
            
            int sum = 0, count = 0;
            while (true) {
                System.out.print("input number : ");
                int number = kb.nextInt();
                if (number < 0) {break;}
                count++;
                sum += number;
            }
            kb.close();
            System.out.println("summation : " + sum);
            System.out.println("you input " + count + " round");
        }
        
    }
}
