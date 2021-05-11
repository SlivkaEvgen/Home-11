public class Task2 {
    public static void main(String[] args) {
        Potoki potoki=new Potoki(30);
        Thread A = new Thread(Potoki::fizz);
        A.start();
        Thread B = new Thread(Potoki::buzz);
        B.start();
        Thread C = new Thread(Potoki::fizzbuzz);
        C.start();
        Thread D = new Thread(Potoki::number);
        D.start();
    }
}
class Potoki {
    private static int n;
    private static int r = 1;
    static StringBuilder nomer = new StringBuilder();

    public Potoki(int n) {
        Potoki.n = n;
    }

    public static synchronized void fizz() {
        if (r % 3 == 0 & r % 5 != 0) {
            nomer.append("fizz, ");
            r++;
        }
    }

    public static synchronized void buzz() {
        if (r % 5 == 0 & r % 3 != 0) {
            nomer.append("buzz, ");
            r++;
        }
    }

    public static synchronized void fizzbuzz() {
        if (r % 3 == 0 & r % 5 == 0) {
            nomer.append("fizzbuzz, ");
            r++;
        }
    }

    public static synchronized void number() {
        while (r <= n) {
            fizz();
            fizzbuzz();
            buzz();
            if (r % 3 != 0 & r % 5 != 0) {
                nomer.append(r).append(", ");
                r++;
            }
        }
        String nomers = nomer.substring(0,nomer.length()-1);
        System.out.println(nomers);
    }
}
