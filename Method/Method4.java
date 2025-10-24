// method รับค่า array เข้ามา
public class Method4 {
    public static void main(String[] args) {
        int []number = {10, 20, 30, 40};
        printArray(number);
    }

    static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i + " = " + arr[i]);
        }
    }
}
