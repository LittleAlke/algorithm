package work.day2;

/**
 * :
 * Alke
 * 2021-03-10 19:44
 */
public class test1 {
    //懒汉式
    private test1(){
    }
    private static class Inner{
        private static final test1 t = new test1();
    }
    public static test1 getin(){
        return Inner.t;
    }
//    //饿汉式
//    private static test1 t = new test1();
//    private test1(){}
//    public static test1 getIn(){
//        return t;
//    }
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println(i);
    }
}
