package iflyer.ribbon.controller;

import iflyer.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/10.
 */
@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public String hi(@RequestParam String name){
		return helloService.hiService(name);
	}


}