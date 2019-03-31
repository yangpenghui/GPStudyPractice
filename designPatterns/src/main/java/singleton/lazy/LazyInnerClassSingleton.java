package singleton.lazy;

/**
 * 内部类懒汉式单例
 * @Author: yangph
 * @Date: 2019/3/26 21:54
 * @Version v1.0
 * @modified By:
 */
public class LazyInnerClassSingleton {
    /**
     * 私有化构造
     */
    private LazyInnerClassSingleton() {
        //调用内部类，构建一个实例，判断内部类的实例不为空，达到防止反射破坏单例的目的
        if(LazyLoader.LAZY!=null){
            throw new RuntimeException("不允许创建多个单例");
        }
    }

    /**
     *static关键字保证了单例对象的空间共享
     * final关键字保证了方法不被重写，重载
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        //先加载静态内部类，再返回结果
        return LazyLoader.LAZY;
    }

    /**
     * 内部类，只有在被调用的时候才会加载，加载完成后才供调用者使用
     */
    private static class LazyLoader {
        private static final LazyInnerClassSingleton LAZY=new LazyInnerClassSingleton();
    }
}
