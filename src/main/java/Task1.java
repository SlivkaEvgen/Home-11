import java.util.Date; //gotovo!!!

public class Task1 {
    static Date d;
    public static void main(String[] args) {
        clock();
        clock2();
    }
    private static void clock() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(new Date());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();

    }
    private static void clock2() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
//
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Прошло 5 секунд");
                }
            }
        });
        t.start();
    }
}