package singleton;

/**
 * <p>
 *     饿汉式:应用中尚未需要用到此单一实例的时候即先实例化
 * </p>
 *
 * @author huangyicao 2017/11/7 17:01
 */
public class SingleTon2 {

    /**
     * 静态实例对象，直接初始化
     */
    private static SingleTon2 singleTon = new SingleTon2();

    /**
     * 私有化构造函数
     */
    private SingleTon2(){

    }
    /**
     * 静态public方法，向整个应用提供单例获取方式
      */
    public static SingleTon2 getInstance(){
        return singleTon;
    }
}
