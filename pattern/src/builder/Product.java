package builder;

/**
 * <p>
 *     产品角色
 * </p>
 *
 * @author huangyicao 2017/11/8 10:08
 */
public class Product {

    private String partA;
    private String partB;

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                '}';
    }
}
