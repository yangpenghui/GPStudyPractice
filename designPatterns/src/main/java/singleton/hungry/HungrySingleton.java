package singleton.hungry;

/**
 * 饿汉式单例模式
 * @Author: yangph
 * @Date: 2019/3/17 19:05
 * @Version v1.0
 * @modified By:
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton=new HungrySingleton();

    private HungrySingleton(){ }

    /**
     * 获取实例
     * @return
     */
    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }
}
