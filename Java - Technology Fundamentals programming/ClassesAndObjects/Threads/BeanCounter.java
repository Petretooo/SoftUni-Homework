package ClassesAndObjects.Threads;

public class BeanCounter extends Thread {

    public String name;

    public BeanCounter(String name) {
        this.name = name;
    }


    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + ":" + i + " beans");

        }
    }
}
