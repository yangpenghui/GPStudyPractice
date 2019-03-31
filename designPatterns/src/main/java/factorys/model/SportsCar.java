package factorys.model;

/**
 * 跑车
 * @Author: yangph
 * @Date: 2019/3/12 13:01
 * @Version v1.0
 * @modified By:
 */
public class SportsCar implements Car {
    /**
     * 跑车报价
     */
    @Override
    public void getPrice() {
        System.out.println("跑车报价是："+"300万");
    }
}
