package ash.wxtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 9:50 AM
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test(){
        return "test success!";
    }
}
