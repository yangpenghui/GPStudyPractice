package factorys.simpleFactory;

import factorys.simpleFactory.simpleFactory.SimpleFactory;
import factorys.simpleFactory.model.Car;
import factorys.simpleFactory.model.SportsCar;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:08
 * @Version v1.0
 * @modified By:
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        /*SimpleFactory factorys.simpleFactory=new SimpleFactory();
        AbstractCar truck = factorys.simpleFactory.create("卡车");
        truck.getPrice();*/


        /*AbstractCar bus= new SimpleFactory().create("factorys.simpleFactory.model.Bus");
        bus.getPrice();*/

        Car car = new SimpleFactory().create(SportsCar.class);
        car.getPrice();

    }
}
