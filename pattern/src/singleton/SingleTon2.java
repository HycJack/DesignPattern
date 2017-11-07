package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *     登记式单例模式:
 *     一般是通过一个专门的类对各单例模式的此单一实例进行管理和维护。
 *     通过Map方式可以方便的实现此中目的。
 * </p>
 *
 * @author huangyicao 2017/11/7 17:01
 */
public class SingleTon2 {

    private static Map singleTonMap = new HashMap();

    /**
     * 静态public方法，向整个应用提供单例获取方式
      */
    public static Object getInstance(String className){
        if(!singleTonMap.containsKey(className)){
            try {
                singleTonMap.put(className,Class.forName(className).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return singleTonMap.get(className);
    }
}

class A{}

class B{}
