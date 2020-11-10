package demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置类
 * 访问 ${context-path}/swagger-ui/index.html
 * [SpringBoot2整合Swagger2最新版本3.0.0 构建前后端分离API接口文档](https://blog.csdn.net/Justforyour/article/details/107760115)
 * @author ashiamd
 */
@Configuration
@EnableOpenApi
public class Swagger2Configuration implements WebMvcConfigurer {

    //api接口包扫描路径
    private static final String SWAGGER_SCAN_BASE_PACKAGE = "demo";

    private static final String VERSION = "1.0.0";

    @Value("${swagger.enabled}")
    private boolean enable;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).pathMapping("/")
                .enable(enable)
                .apiInfo(this.apiInfo())
                .select() // 指定需要发布到Swagger的接口目录，不支持通配符
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("qidao-demo") //设置页面文档的标题
                .description("qidao-demo API 接口文档") // 设置文档的描述
                .version(VERSION) // 设置文档的版本信息-> 1.0.0 Version information
                .build();
    }
}
