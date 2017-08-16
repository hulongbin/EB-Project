package iflyer.feign.controller;

import iflyer.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/15.
 */
@RestController
public class HiController {

	@Autowired
	SchedualServiceHi schedualServiceHi;

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}

