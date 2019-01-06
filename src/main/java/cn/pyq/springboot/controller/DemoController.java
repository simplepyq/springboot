package cn.pyq.springboot.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: pyq
 * @date: 2019-01-06 20:51
 */

@RestController
@Api(description = "维修站点相关")
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("test")
	public String test(){
		return null;
	}
}

