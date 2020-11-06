
public class Members extends Thread{

    @Override
    public void run() {
        super.run();

        int index = 6;

        for (int i = 0; i < index; i++) {

            try {
                System.out.println("deuxieme process");
                sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
