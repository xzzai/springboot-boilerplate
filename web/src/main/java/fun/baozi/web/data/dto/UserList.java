package fun.baozi.web.data.dto;

import fun.baozi.core.domain.page.PageInfo;
import lombok.Data;

/**
 * 用户列表请求.
 *
 * @author baozi
 * 2020-07-15
 */
@Data
public class UserList extends PageInfo {

    /**
     * User name.
     * Max length 10 character
     */
    private String username;


    /**
     * User email
     * eg. xx@gamil.com
     */
    private String email;

    /**
     * User nickname.
     * Default equals to username.
     */
    private String nickname;

    /**
     * Start expire time.
     */
    private String startExpireTime;

    /**
     * End expire time.
     */
    private String endExpireTime;

    /**
     * Start create time.
     */
    private String startCreateTime;

    /**
     * End create time.
     */
    private String endCreateTime;

    /**
     * Start update time.
     */
    private String startUpdateTime;

    /**
     * End update time.
     */
    private String endUpdateTime;
}
