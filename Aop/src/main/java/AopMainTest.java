import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


/**
 * 一起来学习Spring：Spring入门与AOP篇
 * https://www.jianshu.com/p/23ecb9dfc0ad
 *
 */
@SpringBootApplication
@ComponentScan(basePackages ={"com.yanghui.aop","com.yanghui.annotation.annotationandaop"})
@ImportResource({"classpath:/spring.xml"})
public class AopMainTest {
    public static void main(String[] args) {
        SpringApplication.run(AopMainTest.class);
    }
}
