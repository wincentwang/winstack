package wang.wincent.winstack.winapp.modules.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.wincent.winstack.winapp.common.utils.R;
import wang.wincent.winstack.winapp.common.validator.Assert;
import wang.wincent.winstack.winapp.modules.app.service.UserService;

/**
 * 注册
 */
@RestController
@RequestMapping("/app")
public class ApiRegisterController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     */
    @PostMapping("register")
    public R register(String mobile, String password){
        Assert.isBlank(mobile, "手机号不能为空");
        Assert.isBlank(password, "密码不能为空");
        userService.save(mobile, password);
        return R.ok();
    }
}
