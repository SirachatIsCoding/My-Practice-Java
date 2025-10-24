// คัดลอกค่า array 
public class Method8 {
    public static void main(String[] args) {
        int[] numberA = {10, 20, 30, 40};
        int[] numberB = copyArray(numberA);
        printArray(numberA);
        System.out.println("============================");
        printArray(numberB);
    }

    static int[] copyArray(int[] a){
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }
        return newArr;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i + " = " + arr[i]);
        }
    }
}
