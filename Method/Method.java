// การสร้างและเรียกใช้ method
public class Method {
    public static void main(String[] args) {
        display();
        plus();
    }

    static void display(){
        System.out.println("Hello World!");
    }

    static void plus(){
        int a = 10, b = 20, c = a + b;
        System.err.println("sum = " + c);
    }   
}
