package prototype;

/**
 * 原型模式
 * @Author: yangph
 * @Date: 2019/3/31 23:49
 * @Version v1.0
 * @modified By:
 */
public interface Prototype {
    Prototype clone();

    Object deepClone();
}
