package _1;

/**
 * :
 * Alke
 * 2020-12-15 14:51
 */
public class TestEmployee {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.id = "001";
        worker.name = "张三";
        worker.salary = 3000;

        Manager manager = new Manager();
        manager.id = "002";
        manager.name = "王五";
        manager.salary = 10000;

        worker.printMessage();
        manager.printMessage();
    }
}
