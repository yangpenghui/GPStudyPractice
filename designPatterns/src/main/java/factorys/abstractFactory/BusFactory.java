package factorys.abstractFactory;

/**
 * @Author: yangph
 * @Date: 2019/3/12 13:53
 * @Version v1.0
 * @modified By:
 */
public class BusFactory implements AbstractCar{


    @Override
    public Tyre createTyre() {
        return new BusTyre();
    }

    @Override
    public SkyLight createSkyLight() {
        return new BusSkyLight();
    }
}
