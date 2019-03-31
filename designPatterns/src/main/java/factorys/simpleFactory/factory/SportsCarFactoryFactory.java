package factorys.simpleFactory.factory;

import factorys.simpleFactory.model.Car;
import factorys.simpleFactory.model.SportsCar;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:35
 * @Version v1.0
 * @modified By:
 */
public class SportsCarFactoryFactory implements ICarFactory {
    @Override
    public Car create() {
        return new SportsCar();
    }
}
