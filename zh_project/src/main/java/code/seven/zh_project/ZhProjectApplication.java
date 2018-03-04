package code.seven.zh_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"code.seven.zh_project.domain", "code.seven.zh_project.repository", "code.seven.zh_project.config"})
@SpringBootApplication
@EnableAutoConfiguration(exclude={    
	      JpaRepositoriesAutoConfiguration.class//禁止springboot自动加载持久化bean  
	        })
public class ZhProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhProjectApplication.class, args);
	}
}
