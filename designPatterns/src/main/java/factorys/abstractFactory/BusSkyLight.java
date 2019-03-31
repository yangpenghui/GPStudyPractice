package factorys.abstractFactory;

/**
 * 卡车天窗
 * @Author: yangph
 * @Date: 2019/3/17 12:41
 * @Version v1.0
 * @modified By:
 */
public class BusSkyLight implements  SkyLight{
    @Override
    public void lightType() {
        System.out.println("客车是中型型透气天窗");
    }
}
