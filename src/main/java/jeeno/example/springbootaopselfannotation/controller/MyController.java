package jeeno.example.springbootaopselfannotation.controller;

import jeeno.example.springbootaopselfannotation.annotation.OptLog;
import jeeno.example.springbootaopselfannotation.pojo.ReturnDTO;
import jeeno.example.springbootaopselfannotation.pojo.UserDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2019/10/29 21:16
 */
@RestController
public class MyController {

    @OptLog(value = "函数1")
    @GetMapping("/func1")
    public String func1(String name){
        return "func1";
    }

    @GetMapping("/func2")
    public String func2(){
        return "func2";
    }

    @OptLog("获取用户")
    @GetMapping("/user")
    public ReturnDTO<UserDO> getUser(UserDO user) {
        return ReturnDTO.<UserDO>builder()
                .data(user)
                .message("操作成功")
                .status(Boolean.TRUE)
                .build();
    }

    @OptLog("更新用户")
    @PostMapping("/user")
    public ReturnDTO<UserDO> updateUser(@RequestBody UserDO user) {
        return ReturnDTO.<UserDO>builder()
                .data(user)
                .message("操作成功")
                .status(Boolean.TRUE)
                .build();
    }

}
