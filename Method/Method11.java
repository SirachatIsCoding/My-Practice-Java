// return ทำอย่างอื่นได้นะจร๊ะ แต่ only type void taonan
public class Method11 {
    public static void main(String[] args) {
        girlContact(10);
    }

    static void girlContact(int people){
        System.out.println("How many girls u like to have contact : " + people);
        if (people > 3) {
            System.out.println("you are danm badboi! getout!!!");
            return;
        }
        System.out.println("Here's contact : Fuck you");
    }
}
