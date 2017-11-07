package singleton;

/**
 * <p>
 *     懒汉式:延迟加载，即当需要用到此单一实例的时候，才去初始化此单一实例
 * </p>
 *
 * @author huangyicao 2017/11/7 17:01
 */
public class SingleTon1 {

    /**
     * 静态对象
     */
    private static SingleTon1 singleTon;

    /**
     * 私有化构造函数
     */
    private SingleTon1(){

    }
    /**
     * 静态public方法，向整个应用提供单例获取方式
      */
    public static SingleTon1 getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon1();
        }
        return singleTon;
    }
}
