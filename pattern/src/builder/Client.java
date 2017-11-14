package builder;

/**
 * <p>
 *     调用者
 * </p>
 *
 * @author huangyicao 2017/11/14 9:42
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.command();
        Product product = builder.getProduct();
        System.out.println(product);
    }
}
