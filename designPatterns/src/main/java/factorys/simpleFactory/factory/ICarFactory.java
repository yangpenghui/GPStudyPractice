package factorys.simpleFactory.factory;

import factorys.simpleFactory.model.Car;

/**
 * 工厂模型
 * @Author: yangph
 * @Date: 2019/3/17 12:23
 * @Version v1.0
 * @modified By:
 */
public interface ICarFactory {
    Car create();
}
