package Visitor.ASM;

import org.objectweb.asm.*;

/**
 * @Author: Gillian
 * @Date: 2020/11/17-16:13
 * @Description: Gillian_pro:Visitor.ASM
 * @Version: 1.0
 */
public class ClassPrint extends ClassVisitor {

    public ClassPrint(int api) {
        super(api);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println(version + access + name + "sig" + signature + "extends" + superName + interfaces.getClass().getName());
    }

    /*public ClassPrint(int api, ClassVisitor classVisitor) {
        super(api, classVisitor);
    }*/

    @Override
    public void visitSource(String source, String debug) {
        System.out.println("visitSource " + source + debug);
    }

    @Override
    public void visitOuterClass(String owner, String name, String descriptor) {
        System.out.println("visitOuterClass " + owner + name + descriptor);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        System.out.println("visitAnnotation" + descriptor + visible);
        return null;

    }


    @Override
    public void visitAttribute(Attribute attribute) {
        System.out.println("visitAttribute " + attribute);
    }

    @Override
    public void visitInnerClass(String name, String outerName, String innerName, int access) {
        super.visitInnerClass(name, outerName, innerName, access);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        System.out.println("visitField " + access + name + "d "+descriptor + signature + value);
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        System.out.println("visitMethod " + access + name + " d " + descriptor + " s " + signature + " e " + exceptions);
        return super.visitMethod(access, name, descriptor, signature, exceptions);
    }

    @Override
    public void visitEnd() {
        System.out.println("---------");
    }
}
