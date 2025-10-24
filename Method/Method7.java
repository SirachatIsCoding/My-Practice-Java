// สลับค่าใน array
public class Method7 {
    public static void main(String[] args) {
        int[] numberZ = {10, 20, 30, 40};
        printArray(numberZ);
        swapElement(numberZ, 0, 3);
        System.out.println("###### Change ######");
        printArray(numberZ);
    }

    static void swapElement(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i + " = " + arr[i]);
        }
    }
}
