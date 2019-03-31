package singleton.lazy;

/**
 * 懒汉式单例
 * @Author: yangph
 * @Date: 2019/3/17 19:15
 * @Version v1.0
 * @modified By:
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton=null;
    private LazySimpleSingleton(){}

    public static  LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            synchronized ("锁"){
                if(lazySimpleSingleton==null){
                    lazySimpleSingleton=new LazySimpleSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }
}
