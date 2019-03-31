package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: yangph
 * @Date: 2019/3/27 23:05
 * @Version v1.0
 * @modified By:
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton seriableSingleton=null;

        SeriableSingleton seriableSingleton1=SeriableSingleton.getInstance();


        try(FileOutputStream outputStream=new FileOutputStream("SeriableSingleton.obj");
            FileInputStream fileInputStream=new FileInputStream("SeriableSingleton.obj")){
            //序列化
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(seriableSingleton1);
            objectOutputStream.flush();
            objectOutputStream.close();

            //反序列化
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            seriableSingleton=(SeriableSingleton)objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(seriableSingleton);

            System.out.println(seriableSingleton1);

            System.out.println(seriableSingleton==seriableSingleton1);

        }catch(Exception e){

        }
    }
}
