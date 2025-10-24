class ArrayBasic{
    public static void main(String[] args) {
        basic1.run5();
    }

    static class basic1{

        // การสร้าง Array
        static void run1(){
            int []number = new int[4];
            number[0] = 10;
            number[1] = 20;
            number[2] = 30;
            number[3] = 40;
            System.out.println("index 3 = " + number[3]);
        }
        
        // การสร้าง Array
        static void run2(){
            int []number = {10,20,30,40};
            number[3] = 50; // change value in array index 3
            System.out.println("index 3 = " + number[3]);
        }

        // การนับจำนวนสมาชิก Array
        static void run3(){
            String []fruits = {"banana", "apple", "melon"};
            System.out.println(fruits.length);
        }

        // การเข้าถึงสมาชิกด้วย for loop
        static void run4(){
            double []number = {10.2, 9.8, 5.8, 6.7, 6.2, 55.9, 70.12};
            for (int i = 0; i < number.length; i++) {
                System.out.println(number[i]);
            }
        }

        // การเข้าถึงสมาชิกด้วย for each
        static void run5(){
            int []number = {10,20,30,40};
            int sum = 0;
            // n แทนค่าข้างใน Array ไม่ใช่ index
            for(int n : number){
                System.out.println(n);
                sum += n;
            }
            System.out.println("sum = " + sum);
        }
    }
}