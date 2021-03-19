package work.day1;

import java.time.Duration;
import java.time.Instant;

/**
 * :
 * Alke
 * 2021-03-07 15:43
 */
public class Steps {
    static Long step3(int n){
        if (n==1)return 1l;
        if (n==2)return 2l;
        long one = 1;
        long two = 2;
        long sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }

    static Long step2(int n){
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            if (i==0||i==1) arr[i] = i+1;
            else arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }

    static Long step(int i){
        if (i<1){
            throw new IllegalArgumentException(i+"不能小于1");
        }
        if (i==2)return 2l;
        if (i==1)return 1l;
        return step(i-1) + step(i-2);
    }

    public static void main(String[] args) {
//        Instant start = Instant.now();
//        System.out.println(step(40));//496
//        Instant end = Instant.now();
//        System.out.println("耗费时间为：" + Duration.between(start, end).toMillis());

        Instant start2 = Instant.now();
        System.out.println(step2(10000000));//64
        Instant end2 = Instant.now();
        System.out.println("耗费时间为：" + Duration.between(start2, end2).toMillis());

        Instant start3 = Instant.now();
        System.out.println(step3(10000000));//8
        Instant end3 = Instant.now();
        System.out.println("耗费时间为：" + Duration.between(start3, end3).toMillis());

    }
}
