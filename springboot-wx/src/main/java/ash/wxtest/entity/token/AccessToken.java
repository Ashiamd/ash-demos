package ash.wxtest.entity.token;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 2:18 PM
 */
@Data
@Accessors
public class AccessToken {

    private String access_token;

    private int expires_in;
}
