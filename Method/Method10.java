// variable argument -> feel ARRAY แต่เป็นรูปแบบของ arguments (ไม่ต้องเสียเวลาสร้างซ้ำหลายตัว)
public class Method10 {
    public static void main(String[] args) {
        summatiton(20,30,50,40,60);
    }

    static void summatiton(int...number){
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println(sum);
    }
}
