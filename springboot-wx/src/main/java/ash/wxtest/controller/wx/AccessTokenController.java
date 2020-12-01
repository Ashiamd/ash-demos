package ash.wxtest.controller.wx;

import ash.wxtest.service.IAccessTokenService;
import jdk.nashorn.internal.objects.annotations.Property;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 9:53 AM
 */
@Slf4j
@RestController
public class AccessTokenController {

    @Value("${token}")
    private String token;

    @Resource
    IAccessTokenService accessTokenService;


    /**
     * 返回 echostr 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数
     * @param signature 加密签名
     * @param timestamp 时间戳
     * @param nonce 随机数
     * @param echostr 随机字符串
     * @return
     */
    @GetMapping("/wx")
    public String access_token(String signature, String timestamp, String nonce, String echostr){
        String[] arrs = {token,timestamp,nonce};
        Arrays.sort(arrs);
        String s = arrs[0]+arrs[1]+arrs[2];
        String res = DigestUtils.sha1Hex(s);
        if(res.equalsIgnoreCase(signature)){
            log.info("接入成功,success!!");
            return echostr;
        }else{
            log.info("接入失败,failed!!!!!");
            return "error!!! failed!!!";
        }
    }

    @GetMapping("/getAccessToken")
    public String  getAccessToken(){
        return accessTokenService.getAccessToken();
    }
}
