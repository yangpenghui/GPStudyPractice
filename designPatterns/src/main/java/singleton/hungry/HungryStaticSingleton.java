package singleton.hungry;

/**
 * 饿汉式静态块单例
 * @Author: yangph
 * @Date: 2019/3/17 19:09
 * @Version v1.0
 * @modified By:
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    /**
     * 静态块初始化实例
     */
    static{
        hungryStaticSingleton=new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    /**
     * 获取实例
     * @return
     */
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
