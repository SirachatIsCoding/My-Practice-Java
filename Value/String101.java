public class String101 {
    public static void main(String[] args){
        String name1 = "Sirachat";
        String name2 = "Kongkangpop";
        String city = new String("Bangkok nakub");
        String product = "Mobile, PC, Mouse, Keyboard, Microphone";

        // การตัดช่องว่างใน String
        System.out.println("=== cut space in String ===");
        String car = "             Toyota                 ";
        System.out.println(car.length());
        System.out.println(car);
        car = car.trim();
        System.out.println(car.length());
        System.out.println(car);

        // การเอาข้อความย่อย ตัดเอาที่เราสนใจ
        System.out.println("\n=== sub String ===");
        String sub = name1.substring(2,4); // (เริ่มต้น x, จุดสุดท้าย -1)
        System.out.println(sub);

        // การหั่นข้อความ -> ต้องใช้สัญลักษณ์(what ever u want ex. , : . )
        System.out.println("\n=== split String ===");
        String[] product_A = product.split(",");  
        System.out.println(product_A[0]);

        // การแทนที่ข้อความ
        System.out.println("\n=== replace String ===");
        city = city.replace("Bangkok", "Nakronpathom");
        System.out.println(city);

        // ความยาว Stirng
        System.out.println("\n=== lenght of String ===");
        int length = name1.length();
        System.out.println(length);

        // ตำแหน่งตักอักษร
        System.out.println("\n=== Find index of char(String) ===");
        System.out.println(name1.charAt(2));

        // เปรียบเทียบ String -> .equals(สิ่งที่ต้องการเทียบ) จะเทียบโดยสนทุก case ของ letter .equalsIgnoreCase ก็ตามชื่อ
        System.out.println("\n=== String compairation ===");
        if (name1.equals(name2)) {
            System.out.println("Matching!");
        } else {
            System.out.println("Not Matching");
        }

        // หาข้อความหน้าสุด และ หลังสุด
        System.out.println("\n=== Find font and back of text ===");
        if (name1.startsWith("SirH")) {
            System.out.println("Pass!");
        } else {
            System.out.println("Not Pass!");
        }

        if (name2.endsWith("pop")) {
            System.out.println("Pass!");
        } else {
            System.out.println("Not Pass!");
        }

        // หาตำแหน่งของคำในข้อความ
        System.out.println("\n=== Find index of word in String ===");
        System.out.println(name2.indexOf("Kong"));

        //
    }
}
