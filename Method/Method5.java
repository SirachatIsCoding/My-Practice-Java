// รับและส่ง parameter Array
public class Method5 {
    public static void main(String[] args) {
        int[] numberZ = {10, 20, 30, 40};
        int[] numberX = {50, 70, 65};
        System.out.println(maxIndex(numberZ));
        System.out.println(maxIndex(numberX));
    }

    static int maximumArray(int[] arr){
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }  
        return maxvalue;
    }

    static int maxIndex(int[] arr){
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxindex]) {
                maxindex = i;
            }
        }
        return maxindex;
    }
}
