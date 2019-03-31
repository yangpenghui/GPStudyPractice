package factorys.simpleFactory.abstractFactory;

/**
 * 抽象工厂
 * @Author: yangph
 * @Date: 2019/3/12 13:49
 * @Version v1.0
 * @modified By:
 */
public interface AbstractCar {
    Tyre createTyre();

    SkyLight createSkyLight();
}
