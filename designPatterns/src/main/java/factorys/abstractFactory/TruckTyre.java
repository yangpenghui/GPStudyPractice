package factorys.abstractFactory;

/**
 * 卡车轮胎
 * @Author: yangph
 * @Date: 2019/3/17 12:41
 * @Version v1.0
 * @modified By:
 */
public class TruckTyre implements Tyre{
    @Override
    public void tyreSize() {
        System.out.println("卡车轮胎尺寸是21寸");
    }
}
