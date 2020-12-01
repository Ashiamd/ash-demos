package ash.wxtest.service;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 2:00 PM
 */
public interface IAccessTokenService {

    /**
     * 获取access_token
     * access_token用于请求其他微信API接口
     * @return access_token
     */
    String getAccessToken();
}
