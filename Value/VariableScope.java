public class VariableScope {
    static int x = 50; // class

    public static void main(String[] args) {
        //int x = 5; // local
        System.out.println(x);

        num();
    }

    static void num(){
        int x = 10; // local
        System.out.println(x);
    }
}
