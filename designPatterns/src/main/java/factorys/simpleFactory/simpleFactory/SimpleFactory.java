package factorys.simpleFactory.simpleFactory;

import factorys.simpleFactory.model.Car;

/**
 * 简单工厂模式
 * @Author: yangph
 * @Date: 2019/3/12 12:55
 * @Version v1.0
 * @modified By:
 */
public class SimpleFactory {

    /*public AbstractCar create(String carName){
        if("卡车".equals(carName)){
            return new Truck();
        }else if("跑车".equals(carName)){
            return new SportsCar();
        }else if("客车".equals(carName)){
            return new Bus();
        }else{
            return null;
        }
    }*/

   /* public AbstractCar create(String className){
        try {
            if(StringUtils.isNotBlank(className)){
                return (AbstractCar)Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public Car create(Class<? extends Car> clazz){
        try {
            if(clazz!=null){
                return clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
