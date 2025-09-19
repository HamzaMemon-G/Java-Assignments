class PatternPrinter {
    private boolean isDollar = true;

    public synchronized void printDollar() {
        while (!isDollar) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("$");
        isDollar = false;
        notify();
    }

    public synchronized void printHash() {
        while (isDollar) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("#");
        isDollar = true;
        notify();
    }
}

class DollarThread extends Thread {
    private PatternPrinter printer;

    DollarThread(PatternPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printDollar();
        }
    }
}

class HashThread extends Thread {
    private PatternPrinter printer;

    HashThread(PatternPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printHash();
        }
    }
}

public class ThreadPattern {
    public static void main(String[] args) {
        PatternPrinter printer = new PatternPrinter();
        Thread t1 = new DollarThread(printer);
        Thread t2 = new HashThread(printer);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}