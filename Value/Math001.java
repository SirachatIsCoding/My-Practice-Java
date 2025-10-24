public class Math001 {
    public static void main(String[] args) {
        // ค่าคงที่ ClassMath;
        System.out.println("\n=== Constant ===");
        System.out.println(Math.PI);
        System.out.println(Math.E);
        int r = 2;
        double area = Math.PI * r * r;
        System.out.println(area);

        // ค่าสัมบูรณ์ absolute
        System.out.println("\n=== Absolute ===");
        int number = -20;
        System.out.println(Math.abs(number));

        // การปัดเศษ
        System.out.println("\n=== Rounding ===");
        double num = 24.5;
        // ปัดแบบไม่สนตัวทศนิยม
        System.out.println(Math.ceil(num)); // ปัดขึ้น
        System.out.println(Math.floor(num)); // ปัดลง
        // <= .5 ปัดลง
        // > .5 ปัดขึ้น
        System.out.println(Math.rint(num)); // แต่ไอเชี้ยนี่เวลาเจอ x5.5 มันไม่ปัดลงแต่ปัดขึ้นแทน
        // >= .5 ปัดขึ้น
        // <= .4 ปัดลง
        System.out.println(Math.round(num));

        // รากที่ 2
        System.out.println("\n=== Square root ===");
        System.out.println("Find Square root of 9 = " + Math.sqrt(9));

        // ยกกำลัง
        System.out.println("\n=== Exponentiation ===");
        System.out.println(10*10*10*10*10);
        System.out.println(Math.pow(10, 5));
    }

    
}
