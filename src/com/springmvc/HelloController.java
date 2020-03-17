package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//使用@Controller注解申明这是一个基于Annotation注解的控制器类
@Controller
public class HelloController {
    //使用@RequestMapping注解来映射URL及请求方法
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(){
        System.out.println("你好, 基于Annotation的spring MVC程序");
        //创建ModelAndView对象,该对象包含返回视图名，模型名称及模型对象
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据，可以是任意pojo对象
        modelAndView.addObject("msg", "你好，我的第二个基于Annotation注解的spring MVC程序");
        //设置逻辑视图名，通过spring-MVC.xml中的视图解析器讲此处的逻辑请求转换为物理请求
        modelAndView.setViewName("first");
        return modelAndView;
    }
}
