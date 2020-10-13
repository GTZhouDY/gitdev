package com.gitdev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value = "/index")
public class IndexController {
	
	@RequestMapping(value = "/testPage", method = RequestMethod.GET)
    public JSONObject testPage() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("success", true);
		jsonObj.put("msg", "成功");
        return jsonObj;
	}
}
