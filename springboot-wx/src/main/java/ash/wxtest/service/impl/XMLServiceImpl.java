package ash.wxtest.service.impl;

import ash.wxtest.entity.xmlmess.base.IBaseXML;
import ash.wxtest.process.xml.base.BaseXMLProcess;
import ash.wxtest.service.IXMLService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 5:38 PM
 */
@Slf4j
@Service
public class XMLServiceImpl implements IXMLService {

    @Resource
    BaseXMLProcess baseXMLProcess;

    @Override
    public IBaseXML getOriginXMLMessage(String xml) {

        // 1. 判断XML消息类别
        // 2. 获取XML数据并返回
        return baseXMLProcess.getIBaseXML(xml);

    }


}
