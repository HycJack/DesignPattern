package builder;

/**
 * <p>
 *     具体建造者类必须实现这个接口所要求的两种方法：
 *     一种是建造方法(buildPart1和 buildPart2)，
 *     另一种是返还结构方法(retrieveResult)
 * </p>
 *
 * @author huangyicao 2017/11/9 9:35
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("产品-part-001");
    }

    @Override
    public void buildPartB() {
        product.setPartB("产品-part-002");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
