import static java.lang.Thread.sleep;

public class Start {
    public static void main(String[] args) {

        Members members = new Members();

        members.start();

        int index = 5;

        for (int i = 0; i < index; i++) {

            try {
                System.out.println("premiere process");
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
