#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.beans.factory.annotation.Value;

public class Bean1 implements IBean1 {

    private String var1;

    @Override
    public String hello(String name) {
        return var1 + ", " + name;
    }

    @Override
    @Value("${symbol_dollar}{var1}")
    public void setVar1(String var1) {
        this.var1 = var1;
    }
}
