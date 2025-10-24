// รับและว่าส่งค่าข้อมูลของ method
public class Method3 {
    public static void main(String[] args) {
        int numMax = maxNumber(5, 2), numMin = minNumber(5, 2);
        System.out.println("Max number is " + numMax + " and Min number is " + numMin + ", sum is " + sumMation(5, 2));
    }

    static int maxNumber(int a, int b){ 
        if (a == b) {
            return a;
        }else if (a > b) {
            return a;
        }else
            return b;
    }

    static int minNumber(int a, int b){ 
        if (a == b) {
            return a;
        }else if (a > b) {
            return b;
        }else
            return a;
    }
    static int sumMation(int a, int b){
        return a + b;
    }
}
