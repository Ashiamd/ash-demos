package ash.wxtest.controller.wx;

import ash.wxtest.entity.xmlmess.base.IBaseXML;
import ash.wxtest.service.IXMLService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 2:39 PM
 */
@Slf4j
@RestController
public class MessageController {

    @Resource
    IXMLService xmlService;

    /**
     * 原样返回XML数据(测试用)
     * @param xml 微信服务器 == XML源数据 ==> 我们服务器
     * @return XML源数据
     */
    @PostMapping(value = "/wx",produces = "application/xml;charset=utf8")
    public Object getMessage(@RequestBody String xml){
        // 测试获取返回XML数据。(XML源文本 => 我们服务器 => XML对象(传输时被序列化成xml文本) => 微信服务器)
        IBaseXML baseXML = xmlService.getOriginXMLMessage(xml);
        log.info("[ baseXML ] : " + baseXML);
        return baseXML;
    }


//
//    /**
//     * 使用process包下的处理器加工处理数据并返回
//     * @param xml 微信服务器 == XML源数据 ==> 我们服务器
//     * @return (根据XML源数据)加工处理后的XML数据
//     */
//    @PostMapping(value = "/wx",produces = "application/xml;charset=utf8")
//    public Object processMessage(@RequestBody String xml){
//        BaseXML baseXML = xmlService.getXMLMessage(xml);
//        log.info("[ baseXML ] : " + baseXML);
//        return baseXML;
//    }
//

}
