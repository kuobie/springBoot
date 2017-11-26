package cn.itcast.springboot;

import cn.itcast.configuration.DemoConfig;
import cn.itcast.service.impl.DemoServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringbootApplication.class, args);*/

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		DemoServiceImpl service = context.getBean(DemoServiceImpl.class);
		service.outputResult();

		context.close();
	}

}
