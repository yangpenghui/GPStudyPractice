package factorys.simpleFactory.model;

/**
 * 卡车
 * @Author: yangph
 * @Date: 2019/3/12 12:58
 * @Version v1.0
 * @modified By:
 */
public class Truck implements Car{

    /**
     * 获取车的报价
     */
    @Override
    public void getPrice() {
        System.out.println("卡车的报价是："+"180万");
    }
}
