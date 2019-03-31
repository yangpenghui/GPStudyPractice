package factorys.simpleFactory.factory;

import factorys.simpleFactory.model.Bus;
import factorys.simpleFactory.model.Car;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:32
 * @Version v1.0
 * @modified By:
 */
public class BusFactory implements ICarFactory {
    @Override
    public Car create() {
        return new Bus();
    }
}
