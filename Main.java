public class Main {
    public static void main(String[] args) throws InterruptedException {
        var first = new Thread(new Run());
        var second = new MyThread();
        var Third = new Thread(() -> System.out.println("Имя потока: " + Thread.currentThread().getName()));

        first.setName("first");
        second.setName("second");
        Third.setName("Third");

        first.start();
        first.join();

        second.start();
        second.join();

        Third.start();

    }
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Имя потока: " + Thread.currentThread().getName());
        }
    }
}
