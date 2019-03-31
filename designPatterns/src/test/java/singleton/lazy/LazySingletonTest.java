package singleton.lazy;

import singleton.ExecuteLazyThread;

/**
 * @Author: yangph
 * @Date: 2019/3/26 21:16
 * @Version v1.0
 * @modified By:
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        Thread t1=new Thread(new ExecuteLazyThread());

        Thread t2=new Thread(new ExecuteLazyThread());

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
