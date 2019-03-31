package singleton.hungry;

import singleton.ExecuteHungryThread;

/**
 * @Author: yangph
 * @Date: 2019/3/17 19:52
 * @Version v1.0
 * @modified By:
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        Thread t1=new Thread(new ExecuteHungryThread());

        Thread t2=new Thread(new ExecuteHungryThread());

        t1.start();
        t2.start();
    }
}
