package cn.leejean.springcloud.controller;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费
 * @author leejean <br>
 * @version 1.0.0 
 * @date 2017年12月19日 下午3:17:15<br>
 * @see 
 * @since JDK 1.7.0
 */
@RestController
@RequestMapping("/")
public class ConsumerController {
	private static final Log log = LogFactory.getLog(ConsumerController.class);
	@Autowired
	private RestTemplate restTemplate;
 
	private String host="http://localhost:8888";//sleuth-provider
 
	/**
	 * http://localhost:9999/call
	 * @author leejean <br>
	 * @Date 2017年12月19日 下午2:59:47<br>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/call")
	public String call() throws Exception {
		log.info("==============》sleuth-consumer:call============");
		Thread.sleep(getRandomInt(200, 500));
		String url = host + "/xxService";
		String s = this.restTemplate.getForObject(url, String.class);
		return "sleuth-consumer ==》 "+s;
	}
	/**
	 * http://localhost:9999/post?mobile=15921578824
	 * 模拟一个下单过程
	 * @author leejean <br>
	 * @Date 2017年12月19日 下午2:59:47<br>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/post")
	public String post(String mobile) throws Exception {
		log.info("==============》sleuth-consumer:post============");
		Thread.sleep(getRandomInt(1000, 2000));
		String url = host + "/createOrder?mobile="+mobile;
		String s = this.restTemplate.getForObject(url, String.class);
		return "下单成功!订单信息为:"+s;
	}
	public static Integer getRandomInt(Integer min,Integer max){
        return new Random().nextInt(max)%(max-min+1) + min;
	}
}