package Visitor.ASM.test;

import Visitor.ASM.ClassPrint;
import org.objectweb.asm.ClassReader;

import java.io.IOException;

/**
 * @Author: Gillian
 * @Date: 2020/11/17-16:35
 * @Description: Gillian_pro:Visitor.ASM.test
 * @Version: 1.0
 */
public class TestPrint {

    public static void main(String[] args) {
        ClassPrint print = new ClassPrint(458752);
        try {
           ClassReader read = new ClassReader("Proxy.entity.Tank");
            read.accept(print,0);
          /*  FileInputStream file = new FileInputStream("Design_pattern/src/main/java/Visitor/ASM/test/aaa.java");
            ClassReader read = new ClassReader(file);
            read.accept(print,0);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperties().get("user.dir"));
    }
}
