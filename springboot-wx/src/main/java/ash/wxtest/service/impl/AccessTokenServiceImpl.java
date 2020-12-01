package ash.wxtest.service.impl;

import ash.wxtest.entity.token.AccessToken;
import ash.wxtest.entity.token.AccessTokenInfo;
import ash.wxtest.service.IAccessTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 2:00 PM
 */
@Slf4j
@Service
public class AccessTokenServiceImpl implements IAccessTokenService {

    @Value("${appid}")
    private String appid;

    @Value("${secret}")
    private String secret;

    @Resource
    RestTemplate restTemplate;

    private AccessTokenInfo accessTokenInfo;

    @Override
    public String getAccessToken() {

        // 不存在access_token 或者 已经过期
        if (null == accessTokenInfo ||
                accessTokenInfo.getCreateTime() + accessTokenInfo.getAccessToken().getExpires_in() * 1000 < System.currentTimeMillis()) {
            String[] urls = {"https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=", "&secret="};

            StringBuilder sb = new StringBuilder();

            String url = sb.append(urls[0]).append(appid).append(urls[1]).append(secret).toString();

            AccessToken accessToken = restTemplate.getForObject(url, AccessToken.class);

            if (null == accessToken) {
                log.info("从微信服务器获取 AccessToken失败！！！");
                return null;
            } else {
                log.info("[AccessToken - access_token]: " + accessToken.getAccess_token() + System.lineSeparator()
                        + "[AccessToken - expires_in]: " + accessToken.getExpires_in());
                accessTokenInfo = new AccessTokenInfo(accessToken,System.currentTimeMillis());
                return accessToken.getAccess_token();
            }
        }else{
            AccessToken accessToken = accessTokenInfo.getAccessToken();
            log.info("[AccessTokenInfo - creatTime]: " + accessTokenInfo.getCreateTime() + System.lineSeparator()
                    +"[AccessToken - access_token]: " + accessToken.getAccess_token() + System.lineSeparator()
                    + "[AccessToken - expires_in]: " + accessToken.getExpires_in());
            return accessToken.getAccess_token();
        }
    }
}
