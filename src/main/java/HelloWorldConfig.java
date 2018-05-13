import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public A beanA(){
		return new A();
	}
	@Bean
	public B beanB(){
		return new B();
	}
}
