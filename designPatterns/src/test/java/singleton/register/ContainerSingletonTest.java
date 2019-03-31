package singleton.register;

/**
 * @Author: yangph
 * @Date: 2019/3/31 16:24
 * @Version v1.0
 * @modified By:
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        ContainerSingleton containerSingleton=(ContainerSingleton)ContainerSingleton.getBean("singleton.register.ContainerSingleton");

        ContainerSingleton containerSingleton2=(ContainerSingleton)ContainerSingleton.getBean("singleton.register.ContainerSingleton");

        System.out.println(containerSingleton);

        System.out.println(containerSingleton2);

        System.out.println(containerSingleton==containerSingleton2);
    }
}
