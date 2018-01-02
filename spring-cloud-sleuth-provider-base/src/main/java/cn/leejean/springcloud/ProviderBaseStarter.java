package cn.leejean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动基础服务提供者
 * @author leejean <br>
 * @version 1.0.0 
 * @date 2017年12月19日 下午3:16:23<br>
 * @see 
 * @since JDK 1.7.0
 */
@SpringBootApplication
public class ProviderBaseStarter {
	public static void main(String[] args) {
		SpringApplication.run(ProviderBaseStarter.class, args);
	}
}
