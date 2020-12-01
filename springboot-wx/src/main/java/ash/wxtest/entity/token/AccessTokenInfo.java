package ash.wxtest.entity.token;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 2:41 PM
 */
@Data
@Accessors
@AllArgsConstructor
public class AccessTokenInfo {

    private AccessToken accessToken;

    private Long createTime;
}
