package ash.wxtest.test;

import ash.wxtest.entity.xmlmess.TextXML;
import ash.wxtest.service.impl.XMLServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.List;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/12/1 12:58 PM
 */
public class XMLparseTest {
    public static void main(String[] args) throws JsonProcessingException {
        String xml = "<xml><URL>http://121.36.17.148/wx</URL><ToUserName>toUser</ToUserName><FromUserName>fromUser</FromUserName><CreateTime>1348831860</CreateTime><MsgType>text</MsgType><Content>this is a test</Content><MsgId>1234567890123456</MsgId></xml>";
        TextXML textXML = new XmlMapper().readValue(xml, TextXML.class);
        System.out.println(textXML);

        Document document = null;
        Element root = null;
        List<Element> elements = null;
        try {
            document = DocumentHelper.parseText(xml);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        root = document.getRootElement();
        elements = root.elements();
        String msgType = null;
        for(Element e: elements){
            if("MsgType".equals(e.getName())){
                msgType = e.getStringValue();
                break;
            }
        }
        System.out.println(msgType);
    }
}
