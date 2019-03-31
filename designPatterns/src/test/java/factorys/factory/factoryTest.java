package factorys.factory;

import factorys.simpleFactory.factory.BusFactory;
import factorys.simpleFactory.factory.ICarFactory;
import factorys.simpleFactory.factory.SportsCarFactoryFactory;
import factorys.simpleFactory.model.Car;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:39
 * @Version v1.0
 * @modified By:
 */
public class factoryTest {
    public static void main(String[] args) {
        ICarFactory factory=new BusFactory();
        Car car = factory.create();
        car.getPrice();

        factory=new SportsCarFactoryFactory();
        car =factory.create();
        car.getPrice();
    }
}
