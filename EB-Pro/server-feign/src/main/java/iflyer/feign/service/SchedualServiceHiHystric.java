package iflyer.feign.service;

import org.springframework.stereotype.Component;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/16.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}