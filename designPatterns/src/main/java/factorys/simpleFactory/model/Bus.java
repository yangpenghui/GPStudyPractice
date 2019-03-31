package factorys.simpleFactory.model;

/**
 * 客车
 * @Author: yangph
 * @Date: 2019/3/12 13:02
 * @Version v1.0
 * @modified By:
 */
public class Bus implements Car {
    /**
     * 客车报价
     */
    @Override
    public void getPrice() {
        System.out.println("客车报价是："+"60万");
    }
}
