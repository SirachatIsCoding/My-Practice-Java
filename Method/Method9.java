// ค้นหาสมาชิกใน array
public class Method9 {
    public static void main(String[] args) {
        int[] numberA = {10, 20, 40, 80, 160};
        System.out.println(findMemberInArray(numberA, 160));
    }

    static int findMemberInArray(int[] arr, int member){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == member) {
                return i;
            }
        }
        return -1;
    }
}
