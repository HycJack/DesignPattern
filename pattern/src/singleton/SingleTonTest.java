package singleton;

/**
 * <p></p>
 *
 * @author huangyicao 2017/11/7 18:58
 */
public class SingleTonTest {
    public static void main(String[] args) {
        // 获取A类的单例
        A a = (A) SingleTon2.getInstance(A.class.getName());
        // 获取B类的单例
        B b = (B) SingleTon2.getInstance(B.class.getName());
    }
}
