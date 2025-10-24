public class Loop {
    public static void main(String[] args) {
        LoopLoop.run();
    }

    static class WhileLoop {
        static void run(){
            int count = 1;
            while (true) {
                System.out.println("round : " + count + " Good job!");
                count++;
                if (count == 10) {
                    break;
                }
            }
            System.out.println("Programing Done!!");
        }
    }

    static class ForLoop {
        static void run(){
            for (int i = 0; i < 10; i++) {
                System.out.println("GG! " + (i + 1));
                if (i > 3) {
                    break;
                }
                System.out.println("Test!!!");
            }
            System.out.println("Programing Done!!");
        }
        
    }

    static class DoLoop {
        static void run(){
            int count = 1;
            do {
                System.out.println("Bogie " + count);
                count++;
            } while (count < 6);
        }
    }

    static class LoopLoop {
        static void run(){
            int countI = 0, countJ = 0;
            for (int i = 0; i < 5; i++) {
                countI++;
                System.out.println("i loop : " + countI);
                for (int j = 0; j < 5; j++) {
                    countJ++;
                    System.out.println("j loop : " + countJ);
                }
            }
        }
    }
    
}
