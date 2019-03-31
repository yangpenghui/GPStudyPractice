package prototype;

import singleton.SeriableSingleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangph
 * @Date: 2019/3/31 23:50
 * @Version v1.0
 * @modified By:
 */
public class ConcretePrototype implements Prototype, Serializable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    /**+
     * 职业
     */
    private List<String> jobs;

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Prototype clone() {
        ConcretePrototype concretePrototype=new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setJobs(this.jobs);
        return concretePrototype;
    }

    /**
     * 深克隆
     * @return
     */
    @Override
    public Object deepClone() {
        try{
            //字节数组输出流
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
            //写到内存
            objectOutputStream.writeObject(this);

            //字节数组输入流
            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(bis);
            //从内存中读取出来
            ConcretePrototype concretePrototype =(ConcretePrototype) objectInputStream.readObject();
            concretePrototype.setJobs(new ArrayList<>());
            return concretePrototype;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }
}
