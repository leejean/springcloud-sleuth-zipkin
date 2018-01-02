package cn.leejean.springcloud.controller;

import java.util.Date;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * 一个服务
 * @author leejean <br>
 * @version 1.0.0 
 * @date 2017年12月19日 下午3:17:33<br>
 * @see 
 * @since JDK 1.7.0
 */
@RestController
@RequestMapping("/")
public class ProviderController {
	private static final Log log = LogFactory.getLog(ProviderController.class);
	
	/**
	 * http://127.0.0.1:8888/callback
	 * @author leejean <br>
	 * @Date 2017年12月19日 下午3:15:53<br>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/xxService")
	public String xxService() throws Exception {
		Thread.sleep(getRandomInt(500, 2000));
		log.info("==============》sleuth-provider:xxService============");
		return "sleuth-provider:"+new Date().getTime();
	}
	
	
	
	
	
	
	@Autowired
	private RestTemplate restTemplate;
 
	private String host="http://localhost:7777";
 
	/**
	 * http://localhost:9999/call
	 * 
	 * @author leejean <br>
	 * @Date 2017年12月19日 下午2:59:47<br>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/createOrder")
	public String createOrder(String mobile) throws Exception {
		log.info("==============》sleuth-provider:createOrder============");
		Thread.sleep(getRandomInt(1000, 2000));
		String url = host + "/getCode";
		String code = this.restTemplate.getForObject(url, String.class);
		String orderinfo = "{code:"+code+",mobile:"+mobile+",timestamps:"+System.currentTimeMillis()+"}";
		return orderinfo;
	}
	
	public static Integer getRandomInt(Integer min,Integer max){
        return new Random().nextInt(max)%(max-min+1) + min;
	}
}