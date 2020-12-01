package ash.wxtest.entity.xmlmess;

import ash.wxtest.entity.xmlmess.base.IBaseXML;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 文本消息
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 3:31 PM
 */
@Data
@Accessors
@JacksonXmlRootElement(localName = "xml")
public class TextXML implements IBaseXML {

    // 这个字段 微信公众号开发的文档没提到。但是 微信公众平台接口调试工具 这个页面又有，坑爹！
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "URL")
    private String url;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "ToUserName")
    private String toUser;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "FromUserName")
    private String fromUser;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "CreateTime")
    private String createTime;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Content")
    private String content;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MsgId")
    private String msgId;
}
