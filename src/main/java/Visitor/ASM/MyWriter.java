package Visitor.ASM;


import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static jdk.internal.org.objectweb.asm.Opcodes.INVOKESTATIC;

/**
 * @Author: Gillian
 * @Date: 2020/11/18-16:18
 * @Description: Gillian_pro:Visitor.ASM
 * @Version: 1.0
 */
public class MyWriter extends ClassVisitor {
    public MyWriter(int api, ClassVisitor classVisitor) {
        super(api, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        return new MethodVisitor(super.api,mv) {
            @Override
            public void visitCode() {
                visitMethodInsn(INVOKESTATIC,"Factory/entity/Sword","shot","()V",false);
                super.visitCode();
            }
        };
    }
}
