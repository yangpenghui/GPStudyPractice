package factorys.abstractFactory;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:53
 * @Version v1.0
 * @modified By:
 */
public class TruckFactory implements AbstractCar{


    @Override
    public Tyre createTyre() {
        return new TruckTyre();
    }

    @Override
    public SkyLight createSkyLight() {
        return new TruckSkyLight();
    }
}
