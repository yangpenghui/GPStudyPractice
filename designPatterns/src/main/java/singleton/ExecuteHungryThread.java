package singleton;

import singleton.hungry.HungryStaticSingleton;

/**
 * @Author: yangph
 * @Date: 2019/3/17 19:24
 * @Version v1.0
 * @modified By:
 */
public class ExecuteHungryThread implements Runnable {
    @Override
    public void run() {
        HungryStaticSingleton  hungryStaticSingleton=HungryStaticSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+hungryStaticSingleton);
    }
}
