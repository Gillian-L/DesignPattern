package Visitor.ASM.test;

import java.io.*;
import java.util.Arrays;

/**
 * @Author: Gillian
 * @Date: 2020/11/19-15:33
 * @Description: Gillian_pro:Visitor.ASM.test
 * @Version: 1.0
 */
public class MyClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String path = (String)System.getProperties().get("user.dir");
        File file = new File(path+"/Design_pattern/target/ASM/",name.replace(".","/").concat(".class"));
        try {
            FileInputStream inputStream = new FileInputStream(file);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           byte[] data =  new byte[inputStream.available()];
           inputStream.read(data);
            int b =0;
            while(true){
                try {
                    if (!((b=inputStream.read())!=0)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                outputStream.write(b);
                byte[] bytes = outputStream.toByteArray();

                outputStream.close();
                inputStream.close();
                System.out.println(Arrays.toString(data));
                System.out.println(name);
                return defineClass(name,data,0,data.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
