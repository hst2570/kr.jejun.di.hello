import org.junit.Test;
import org.springframework.context.support.StaticApplicationContext;

/**
 * Created by User on 2016-05-10.
 */
public class StaticApplicationContextTest {
    @Test
    public void applicetionContext(){
        StaticApplicationContext staticApplicationContext = new StaticApplicationContext();
        staticApplicationContext.registerPrototype("hello", HelloImpl.class);
        Hello hello = staticApplicationContext.getBean("hello", Hello.class);
        assertThat(hello.sayHello(), is("hello"));
    }
}
