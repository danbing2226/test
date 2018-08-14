package sakura;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
@EnableTransactionManagement //启用注解事物管理
public class Application extends SpringBootServletInitializer{
 public static void main(String[] args) throws Exception{
	SpringApplication.run(Application.class, args);
}
 @Bean
 public PlatformTransactionManager txManager(DataSource dataSource) {
	 return new DataSourceTransactionManager(dataSource);
 }
 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	 return application.sources(Application.class);
 }
}
