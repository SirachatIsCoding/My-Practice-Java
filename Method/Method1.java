// method รับค่าข้อมูล
public class Method1 {
    public static void main(String[] args) {
        display("Hi bogie!");
        fullName("Sirachat", "Wounsuew");
        calculatePlusNumber(10, 20);
    }

    static void display(String message){ // massage is parameter
        System.out.println(message);
    }

    static void fullName(String firstname, String lastname){
        System.out.println(firstname + " " + lastname);
    }

    static void calculatePlusNumber(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}
