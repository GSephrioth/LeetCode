package Easy;

/**
 * @author xuzhu.chen
 * @since 2019-09-05
 */
public class Print_in_Order {

    volatile int check = 0;

    public Print_in_Order() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        check = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        check(1);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        check = 2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        check(2);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    private void check(int step) {
        while (check != step) {
        }
    }
}
