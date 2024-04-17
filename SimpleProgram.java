public class SimpleProgram {

    public static void main(String[] args) {
        SimpleProgram program = new SimpleProgram();
        program.run();
    }

    public void run() {
        int number = 5;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " la so chan.");
            } else {
                System.out.println(i + " la so le.");
            }
        }
    }
}
