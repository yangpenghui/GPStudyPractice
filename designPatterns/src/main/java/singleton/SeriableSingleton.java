package singleton;

import java.io.Serializable;

/**
 * 饿汉式单例，用于测试序列化和反序列化
 * @Author: yangph
 * @Date: 2019/3/27 23:01
 * @Version v1.0
 * @modified By:
 */
public class SeriableSingleton implements Serializable {
    /**
     * 私有构造
     */
    private SeriableSingleton(){}
    private static final SeriableSingleton INSTANCE=new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //可以防止序列化反序列化破坏单例
    private Object readResolve(){
        return INSTANCE;
    }
}
