package singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 利用反射测试静态内部类懒加载单例
 * @Author: yangph
 * @Date: 2019/3/26 22:10
 * @Version v1.0
 * @modified By:
 */
public class LazyInnerClassTest {

    public static void main(String[] args) throws Exception {
        Class<?> clazz=LazyInnerClassSingleton.class;
        //通过反射拿到是有构造
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        //强制访问
        constructor.setAccessible(true);
        //暴力初始化
        Object o1 = constructor.newInstance();
        //再次初始化
        Object o2=constructor.newInstance();

        System.out.println(o1==o2);

    }
}
