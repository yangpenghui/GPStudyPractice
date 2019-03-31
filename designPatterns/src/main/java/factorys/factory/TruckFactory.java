package factorys.factory;

import factorys.model.Car;
import factorys.model.Truck;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:34
 * @Version v1.0
 * @modified By:
 */
public class TruckFactory implements ICarFactory {

    @Override
    public Car create() {
        return new Truck();
    }
}
