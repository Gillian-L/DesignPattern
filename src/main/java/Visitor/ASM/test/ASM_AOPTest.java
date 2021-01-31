package Visitor.ASM.test;

import Visitor.ASM.MyWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Gillian
 * @Date: 2020/11/18-16:17
 * @Description: Gillian_pro:Visitor.ASM.test
 * @Version: 1.0
 */
public class ASM_AOPTest {
    public static void main(String[] args) {
        try {
            ClassReader read = new ClassReader(new FileInputStream("Design_pattern/target/classes/Factory/entity/Car.class"));
            //          ClassReader read1 = new ClassReader(ClassTransformTest.class.getResourceAsStream("target/classes/Factory/entity/Car.class"));
            ClassWriter writer = new ClassWriter(0);
           /* ClassVisitor visitor = new ClassVisitor(458752,writer) {
               *//* @Override
                public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                    super.visit(version, access, name, signature, superName, interfaces);
                }*//*
            };*/
            MyWriter aop = new MyWriter(Opcodes.ASM4,writer);
            read.accept(aop,0);
            byte[] bytes = writer.toByteArray();
            String path = (String)System.getProperties().get("user.dir");
            File file = new File(path+"/Design_pattern/target/ASM");
            System.out.println(file.mkdirs());
            FileOutputStream out = new FileOutputStream(path+"/Design_pattern/target/ASM/aa.class");
            out.write(bytes);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
