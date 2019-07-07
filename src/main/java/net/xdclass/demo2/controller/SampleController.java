package net.xdclass.demo2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
 * @RestController=@Controller+@ResponseBody
 */
//@Controller
//@EnableAutoConfiguration
@RestController
public class SampleController {
	
	@RequestMapping("/")
	//@ResponseBody
	public String test(){
		return "hello";
	}
	@RequestMapping("/test")
	//@ResponseBody
	public Map<String,String>testMap(){
		Map<String,String>map=new HashMap<String,String>();
		map.put("name", "xdclass2");
		return map;
	}
}
