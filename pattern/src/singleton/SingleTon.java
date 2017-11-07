package singleton;

/**
 * <p>
 *     懒汉式:延迟加载，即当第一次用到此单一实例的时候，才去初始化此单一实例
 * </p>
 *
 * @author huangyicao 2017/11/7 17:01
 */
public class SingleTon {

    /**
     * 静态对象
     */
    private static SingleTon singleTon;

    // 线程安全的写法，静态实例变量加上volatile
//    private static volatile SingleTon instance;

    /**
     * 私有化构造函数
     */
    private SingleTon(){

    }
    /**
     * 静态public方法，向整个应用提供单例获取方式
      */
    public static SingleTon getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }



    // 线程安全的写法，双重检查锁
//    public static SingleTon getInstance() {
//        if (instance == null) {
//            synchronized(Singleton.class){
//                if(instance == null){
//                    instance = new SingleTon();
//                }
//            }
//        }
//        return instance;
//    }
}
