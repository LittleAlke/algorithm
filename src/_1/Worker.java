package _1;

/**
 * :
 * Alke
 * 2020-12-15 14:41
 */
public class Worker extends Employee {

    @Override
    public void printMessage() {
        System.out.println("Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + calculateSalary() +
                '}');
    }

    @Override
    public int calculateSalary() {
        return salary + 100;
    }

}
