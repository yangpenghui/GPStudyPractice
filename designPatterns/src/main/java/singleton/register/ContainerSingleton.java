package singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器缓存式单例，适用于创建实例非常多的情况
 * @Author: yangph
 * @Date: 2019/3/31 16:09
 * @Version v1.0
 * @modified By:
 */
public class ContainerSingleton {
    /**
     * 私有构造
     */
    private ContainerSingleton() {
    }

    /**
     * 创建容器 ConcurrentHashMap支持并发
     */
    private static Map<String,Object> ioc=new ConcurrentHashMap<>();


    /**
     * 根据类名获取实例
     * @param className
     * @return
     */
    public static Object getBean(String className){
        synchronized (ioc){
            //ioc中没有当前类的实例
            if(!ioc.containsKey(className)){
                Object obj=null;
                try {
                    //根据类名创建实例，并把实例放到ioc容器中
                    obj= Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                //ioc中已经用当前实例，直接取出返回
                return ioc.get(className);
            }
        }
    }
}
