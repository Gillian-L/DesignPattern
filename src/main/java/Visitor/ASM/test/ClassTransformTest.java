package Visitor.ASM.test;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.*;

/**
 * @Author: Gillian
 * @Date: 2020/11/18-14:32
 * @Description: Gillian_pro:Visitor.ASM.test
 * @Version: 1.0
 */
public class ClassTransformTest {

    public static void main(String[] args) {
        try {
            ClassReader read = new ClassReader(new FileInputStream("Design_pattern/target/classes/Factory/entity/Car.class"));
  //          ClassReader read1 = new ClassReader(ClassTransformTest.class.getResourceAsStream("target/classes/Factory/entity/Car.class"));
            ClassWriter writer = new ClassWriter(0);
            ClassVisitor visitor = new ClassVisitor(458752,writer) {
               /* @Override
                public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                    super.visit(version, access, name, signature, superName, interfaces);
                }*/
            };
            read.accept(writer,0);
            byte[] bytes = writer.toByteArray();
            String path = (String)System.getProperties().get("user.dir");
            File file = new File(path+"/Design_pattern/target/ASM");
            System.out.println(file.mkdirs());
            FileOutputStream out = new FileOutputStream(path+"/Design_pattern/target/a.class");
            out.write(bytes);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
