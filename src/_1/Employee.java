package _1;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * :
 * Alke
 * 2020-12-15 14:30
 */
public abstract class Employee {
    String id;
    String name;
    int salary;

    public Employee() {
    }

    //输出信息
    public abstract void printMessage();

    //计算月薪
    public abstract int calculateSalary();

}
