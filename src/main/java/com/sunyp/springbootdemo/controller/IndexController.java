package com.sunyp.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @date201914
 */
@Controller //响应走视图解析器、如果前后端不分离的话，freemarker比jsp的优势大，因为数据渲染是放在了页面而不像jsp一样全部放在后台进行，效率相对jsp就高
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap map){//类似于mvc的ModelAndView ,返回的字符串就是freemarker模板的路径(指定配置下)
        map.addAttribute("name","sunyp");
        List<String> userList = new ArrayList<>();
        userList.add("孙");
        userList.add("王");
        map.addAttribute("userList",userList);
        return "index";
    }
}
