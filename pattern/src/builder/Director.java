package builder;

/**
 * <p>
 *     导演者角色
 *     builder可以也作为command方法的入参传入
 * </p>
 *
 * @author huangyicao 2017/11/9 9:37
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void command(){
        builder.buildPartA();
        builder.buildPartB();
    }
}
