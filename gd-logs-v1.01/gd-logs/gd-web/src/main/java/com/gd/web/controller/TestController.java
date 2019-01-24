package com.gd.web.controller;

import com.gd.logs.entity.LogsUserBrowse;
import com.gd.logs.entity.LogsVideoDelete;
import com.gd.logs.service.LogsUserBrowseService;
import com.gd.logs.service.LogsVideoDeleteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    //@Autowired
//    @Resource
//    private UserService userService;
    @Resource
    private LogsUserBrowseService logsUserBrowseService;
    @Resource
    private LogsVideoDeleteService logsVideoDeleteService;

//    @RequestMapping("/user/findAll")
//    public List<User> findAll(){
//        return userService.findAll();
//    }

    @RequestMapping("/logUserBrowse/findAll")
    public List<LogsUserBrowse> findAlls() {
        return logsUserBrowseService.findAll();
    }

    @RequestMapping("/logsVideoDelete/findAll")
    public List<LogsVideoDelete> findAllss() {
        return logsVideoDeleteService.findAll();
    }
//    private static final String provider_url = "http://PROVIDER-LOGS-USER-8010";
//    // SpringCloud-基于http协议-REST结构
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @SuppressWarnings("unchecked") //压制警告
//
//    @RequestMapping("/findAll")
//    public List<User> findAll(){
//        // 参数一: 访问服务端路劲 参数二: 返回数据类型
//        return restTemplate.getForObject(provider_url+"/findAll", List.class);
//    }
}
