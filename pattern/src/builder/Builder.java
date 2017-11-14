package builder;

/**
 * <p>
 *     抽象建造者
 * </p>
 *
 * @author huangyicao 2017/11/9 9:33
 */
public interface Builder {
    public void buildPartA();
    public void buildPartB();

    public Product getProduct();
}
