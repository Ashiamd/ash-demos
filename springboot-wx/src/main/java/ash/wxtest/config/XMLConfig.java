package ash.wxtest.config;

import ash.wxtest.process.xml.base.BaseXMLProcess;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/12/1 11:15 AM
 */
@Configuration
public class XMLConfig {

    @Bean
    public XmlMapper xmlMapper(){return new XmlMapper();}

    @Bean
    public BaseXMLProcess baseXMLProcess(){return new BaseXMLProcess();}
}
