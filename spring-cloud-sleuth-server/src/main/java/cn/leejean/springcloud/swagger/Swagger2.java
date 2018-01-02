package cn.leejean.springcloud.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * TODO Spring Boot中使用Swagger2构建RESTful APIs.<br>
 * @author Leejean <br>
 * @version 1.0.0 2017年4月9日 下午1:32:06<br>
 * @see  http://127.0.0.1:8080/swagger-ui.html
 * 
 */
//@Api：修饰整个类，描述Controller的作用
//@ApiOperation：描述一个类的一个方法，或者说一个接口
//@ApiParam：单个参数描述
//@ApiModel：用对象来接收参数
//@ApiProperty：用对象接收参数时，描述对象的一个字段
//@ApiResponse：HTTP响应其中1个描述
//@ApiResponses：HTTP响应整体描述
//@ApiIgnore：使用该注解忽略这个API
//@ApiError ：发生错误返回的信息
//@ApiParamImplicitL：一个请求参数
//@ApiParamsImplicit 多个请求参数
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.leejean.springcloud"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springcloud-sleuth Apis")
                .description("这是springcloud sleuth的一个栗子")
                .termsOfServiceUrl("https://github.com/leejean/")
                .contact("易理坚")
                .version("1.0.0")
                .build();
    }

}
