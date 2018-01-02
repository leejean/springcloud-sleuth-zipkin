package cn.leejean.springcloud.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
public class DemoController {
//	@ApiIgnore
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="打个招呼吧", notes="调用我给你说哈罗")
    public String say() {
        return "屌丝...别整天哈罗哈罗的，哈罗你妹啊！";
    }
    
	@RequestMapping(value="/getGril",method=RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="new一个女朋友", notes="输入女朋友的要求")
	@ApiImplicitParam(name = "gril", value = "妹子", required = true, dataType = "Girl")
    public String getGril(@RequestBody Girl gril) {
        return gril.say();
    }
}