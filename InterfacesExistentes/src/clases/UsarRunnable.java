package clases;

public class UsarRunnable {
    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Dentro de Thread 1");
//            }
//        };
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Dentro de Thread 2");
//            }
//        };  
        Runnable r1 = () -> System.out.println("Dentro de thread 1");
        Runnable r2 = () -> System.out.println("Dentro de thread 2");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
