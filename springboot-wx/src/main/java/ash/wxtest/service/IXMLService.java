package ash.wxtest.service;

import ash.wxtest.entity.xmlmess.base.IBaseXML;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 5:34 PM
 */
public interface IXMLService {

    /**
     * 原样返回XML源数据
     * @param xml XML源数据(微信服务器 => 我们服务器)
     * @return XML源数据(对象)
     */
    IBaseXML getOriginXMLMessage(String xml);

}
