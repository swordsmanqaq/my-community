package com.byteville.community.controller;/**
 * @author shkstart
 * @create 2024-01-28 00:55
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *@Auther:Jarvis
 *@Date:2024年01月2024/1/28日00:55
 *@Description:
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String test(){
        return "index";
    }
}
