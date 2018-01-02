package cn.leejean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 启动服务提供者
 * @author leejean <br>
 * @version 1.0.0 
 * @date 2017年12月19日 下午3:16:23<br>
 * @see 
 * @since JDK 1.7.0
 */
@SpringBootApplication
public class ProviderStarter {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(ProviderStarter.class, args);
	}
}
