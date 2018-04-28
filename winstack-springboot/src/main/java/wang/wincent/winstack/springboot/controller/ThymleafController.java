package wang.wincent.winstack.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wincent
 * @description: <描述>
 * @create 2018-04-28 14:58
 */
@Controller
public class ThymleafController {

    @RequestMapping("/thymleaf")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://wincent.wang");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
