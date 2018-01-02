package cn.leejean.springcloud.controller;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 假设这是一个分布式环境下的发号器服务
 * @author leejean <br>
 * @version 1.0.0 
 * @date 2017年12月19日 下午3:17:33<br>
 * @see 
 * @since JDK 1.7.0
 */
@RestController
@RequestMapping("/")
public class ProviderBaseController {
	private static final Log log = LogFactory.getLog(ProviderBaseController.class);
	/**
	 * http://127.0.0.1:8888/getOrderCode
	 * 模拟发号
	 * @author leejean <br>
	 * @Date 2017年12月19日 下午3:15:53<br>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCode")
	public String getCode() throws Exception {
		log.info("==============》sleuth-provider-base:createOrder============");
		Thread.sleep(getRandomInt(500, 1000));
		return "T"+String.valueOf(System.currentTimeMillis());
	}
	
	public static Integer getRandomInt(Integer min,Integer max){
        return new Random().nextInt(max)%(max-min+1) + min;
	}
}