package cn.leejean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
//@EnableZipkinStreamServer //使用Stream方式启动ZipkinServer
public class SleuthServer {
	/**
	 * 启动应用
	 * @author leejean <br>
	 * @Date 2017年12月19日 上午10:42:08<br>
	 * http://127.0.0.1:8080/hello
	 */
	public static void main(String[] args) {
		SpringApplication.run(SleuthServer.class, args);
	}

}
