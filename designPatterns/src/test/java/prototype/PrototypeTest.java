package prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.tools.jar.CommandLine;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式测试
 * @Author: yangph
 * @Date: 2019/4/1 0:01
 * @Version v1.0
 * @modified By:
 */
public class PrototypeTest {
    /**
     * 日志组件
     */
    private static final Logger logger=LoggerFactory.getLogger(PrototypeTest.class);

    public static void main(String[] args) {
        //创建一个对象
        ConcretePrototype concretePrototype=new ConcretePrototype();

        //设置属性值
        concretePrototype.setName("张三");
        concretePrototype.setAge(20);
        List<String> jobs=new ArrayList<>();
        concretePrototype.setJobs(jobs);

        System.out.println(concretePrototype);

        Client client=new Client(concretePrototype);
        ConcretePrototype prototypeClone =(ConcretePrototype) client.startClone(concretePrototype);

        System.out.println(prototypeClone);

        System.out.println("克隆对象中的引用类型地址值:"+prototypeClone.getJobs());
        System.out.println("原对象中的引用类型地址值:"+concretePrototype.getJobs());
        System.out.println(prototypeClone.getJobs()==concretePrototype.getJobs());
    }
}
