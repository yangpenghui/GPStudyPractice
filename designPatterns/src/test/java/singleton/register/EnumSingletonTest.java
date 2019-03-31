package singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 注册式单例测试
 * @Author: yangph
 * @Date: 2019/3/28 20:34
 * @Version v1.0
 * @modified By:
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1=null;
        EnumSingleton instance2=EnumSingleton.getInstance();

        instance2.setData(new Object());

        try(
                FileOutputStream outputStream=new FileOutputStream("EnumSingleton.obj");
                FileInputStream inputStream=new FileInputStream("EnumSingleton.obj")
            ){
            //序列化
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(instance2);
            objectOutputStream.flush();
            objectOutputStream.close();

            //反序列化
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            instance1 = (EnumSingleton)objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(instance1.getData());

            System.out.println(instance2.getData());

            System.out.println(instance1==instance2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
