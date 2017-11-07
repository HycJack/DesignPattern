package singleton;

/**
 * <p>
 *     懒汉式改进
 *     其主要原理为：Java中静态内部类可以访问其外部类的成员属性和方法，
 *     同时，静态内部类只有当被调用的时候才开始首次被加载，利用此特性，
 *     可以实现懒汉式，在静态内部类中静态初始化外部类的单一实例即可。
 * </p>
 *
 * @author huangyicao 2017/11/7 17:01
 */
public class SingleTon3 {

    /**
     * 静态内部类
     */
    private static class SingleTonBuilder{
        private static SingleTon3 singleTon = new SingleTon3();
    }

    /**
     * 私有化构造函数
     */
    private SingleTon3(){

    }
    /**
     * 静态public方法，向整个应用提供单例获取方式
      */
    public static SingleTon3 getInstance(){
        return SingleTonBuilder.singleTon;
    }

}
