package cn.leejean.springcloud.controller;

import io.swagger.annotations.ApiModelProperty;
/**
 * 
 * 妹子.<br>
 * @author leejean <br>
 * @version 1.0.0 
 * @date 2017年12月19日 下午2:09:45<br>
 * @see 
 * @since JDK 1.7.0
 */
public class Girl {
	
	@ApiModelProperty("姓名") 
    private String name = "";
    
    @ApiModelProperty("年龄")
    private Integer age = 18;
    
    @ApiModelProperty("用户身高") 
    private Double height = 168.0;
	
	public Integer getAge() {
		return age;
	}
	
	public Girl() {}
	
	public Girl(String name, Integer age, Double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String say() {
		return "你好主人，我是"+this.name+"，今年"+this.age+"岁了，身高"+this.height+"厘米";
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
}

