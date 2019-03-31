package prototype;

/**
 * @Author: yangph
 * @Date: 2019/3/31 23:58
 * @Version v1.0
 * @modified By:
 */
public class Client {
    private Prototype prototype;

    /**
     * 有参构造
     * @param prototype
     */
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Object startClone(Prototype prototype){
        //return prototype.clone();
        return prototype.deepClone();

    }
}
