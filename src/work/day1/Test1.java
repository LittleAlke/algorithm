package work.day1;

/**
 * :
 * Alke
 * 2021-03-07 9:19
 */
public class Test1 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//i入栈 ，i++变成2 ，i出栈 i最后变成1
        int j = i++; //j = 1
        //i = 2
        int k = i + ++i * i++; //1 3 3
        System.out.println("i="+i);//4
        System.out.println("j="+j);//1
        System.out.println("k="+k);//11
    }
}
