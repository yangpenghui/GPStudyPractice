package singleton.register;

/**
 * 注册式单例
 * @Author: yangph
 * @Date: 2019/3/28 20:22
 * @Version v1.0
 * @modified By:
 */
public enum EnumSingleton {
    INSTAANCE
    ;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTAANCE;
    }

}
