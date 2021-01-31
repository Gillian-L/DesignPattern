package Proxy.demo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-15:06
 * @Description:
 * @Version: 1.0
 */
@Aspect
public class MoveAspect {

    @Around("execution(* Proxy.entity.Tank.move(..))")
   public Object around(ProceedingJoinPoint proceeding){
        Object o = null;
       long start = System.currentTimeMillis();
       // tank = new Tank();
        try {
            o = proceeding.proceed(proceeding.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end = System.currentTimeMillis();
       System.out.println(end-start);
        System.out.println(o);
        return o;
   }
    @Before("execution(* Proxy.entity.Tank.move(..))")
    //@Before("execution(* Proxy.entity.Movable.move(..))")
    public void before(){
        System.out.println("aspect-before---------");
    }
    @After("execution(* Proxy.entity.Tank.move(..))")
    public void after(){
        System.out.println("aspect-after---------");
    }
}
