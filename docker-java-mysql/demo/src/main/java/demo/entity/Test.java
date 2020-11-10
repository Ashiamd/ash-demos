package demo.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * (Test)表实体类
 *
 * @author ashiamd
 * @since 2020-11-10 13:15:26
 */
@SuppressWarnings("serial")
public class Test extends Model<Test> {

    private String username;

    private String password;

    private String info;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}