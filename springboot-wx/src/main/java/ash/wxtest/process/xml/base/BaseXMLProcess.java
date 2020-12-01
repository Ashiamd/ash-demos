package ash.wxtest.process.xml.base;

import ash.wxtest.entity.xmlmess.TextXML;
import ash.wxtest.entity.xmlmess.base.IBaseXML;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/12/1 9:40 AM
 */
@Slf4j
public class BaseXMLProcess {

    @Resource
    XmlMapper xmlMapper;

    /**
     * 判断XML消息类别，并返回对应类别的XML对象
     * @param xml
     * @return
     */
    public IBaseXML getIBaseXML(String xml){
        try {
            return getIBaseXML(xml,"text");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            log.error("[ getIBaseXML(String xml,String msgType) ]: 转换XML文本 => 对象时，抛出异常");
            log.error(e.getMessage());
        }
        return null;
    }

    /**
     * (根据XML文本)获取XML消息的类别
     * @param xml
     * @return XML消息类别(text,image,video ...)
     */
    private String getMsgType(String xml){
        log.info("[ xml 源文本]: "+xml);
        // Dom4j解析XML文本，判断消息类别(文本、图片、视频...)
        Document document = null;
        Element root = null;
        List<Element> elements = null;
        try {
            document = DocumentHelper.parseText(xml);
        } catch (DocumentException e) {
            e.printStackTrace();
            log.error("[ getMsgType - error]: 解析XML文本，获取类别msgType时出错");
            log.error(e.getMessage());
            return null;
        }
        root = document.getRootElement();
        if(root==null){
            log.error("解析XML文本时，获取根节点<xml>失败！");
            return null;
        }
        elements = root.elements();
        String msgType = null;
        for(Element e: elements){
            if("MsgType".equals(e.getName())){
                msgType = e.getStringValue();
                break;
            }
        }
        return msgType;
    }



    /**
     * 将XML文本转换为指定类别XML对象
     * @param xml
     * @return
     */
    private IBaseXML getIBaseXML(String xml,String msgType) throws JsonProcessingException {
        if(xml!=null&&msgType!=null){
            switch (msgType){
                // 文本消息
                case "text":
                   TextXML textXML = xmlMapper.readValue(xml, TextXML.class);
                   return textXML;
                // 图片消息
                case "image":
                    return null;
                // 语音消息
                case "voice":
                    // 视频消息
                    return null;
                case "video":
                    return null;
                // 小视频消息
                case "shortvideo":
                    return null;
                // 地理位置消息
                case "location":
                    return null;
                // 链接消息
                case "link":
                    return null;
                // 事件(关注/取消关注 等)
                case "event":
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }


//    private IBaseXML toTextXML(String xml,)

}
