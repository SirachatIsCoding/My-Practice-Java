public class TwoDArray {

    public static void main(String[] args) {
        basic2DArray.run2();
    }

    class basic2DArray {
        // การสร้าง Array 2 มิติ
        static void run1(){
            String [][] Product = {
                // column 0   colum 1   colum 2
                {"Keyboard", "mouse", "Headphone"}, // แถว 0
                {"banana", "apple", "watermelon"},  // แถว 1
                {"pencil", "eraser", "ruler"} // แถว 2
            };
            // Product[เลขแถว][เลขคอลัมน์]
            System.out.println(Product[1][1]); 
            // เปลี่ยนสมาชิก
            Product[1][1] = "mango";
            System.out.println(Product[1][1]);
        }

        // เข้าถึงด้วย for loop
        static void run2(){
            String [][] Product = {
                {"Keyboard", "mouse"},
                {"banana", "apple", "watermelon"},
                {"pencil", "eraser"}
            };
            
            for (int row = 0; row < Product.length; row++) {
                for (int column = 0; column < Product[row].length; column++) {
                    System.out.println("Product[" + row + "][" + column + "] = " + Product[row][column]);
                }
            }
        }
        
    }
}