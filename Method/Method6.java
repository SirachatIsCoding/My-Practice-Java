// เปรียบเทียบ array 
public class Method6 {
    public static void main(String[] args){
        int[] numberZ = {10, 20, 30, 40};
        int[] numberX = {10, 20, 30};
        System.out.println(compareArray(numberZ, numberX));
    }

    static boolean compareArray(int[] a, int[] b){
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
