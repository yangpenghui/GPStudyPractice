package factorys.abstractFactory;

import factorys.simpleFactory.abstractFactory.TruckFactory;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:56
 * @Version v1.0
 * @modified By:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        TruckFactory factory=new TruckFactory();
        factory.createTyre().tyreSize();

        factory.createSkyLight().lightType();
    }
}
