package singleton;

import singleton.lazy.LazySimpleSingleton;

/**
 * @Author: yangph
 * @Date: 2019/3/17 19:24
 * @Version v1.0
 * @modified By:
 */
public class ExecuteLazyThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton=LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);
    }
}
