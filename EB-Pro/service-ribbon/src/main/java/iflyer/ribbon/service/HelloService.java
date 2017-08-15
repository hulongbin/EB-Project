package iflyer.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/10.
 */
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	public String hiService(String name) {
		return restTemplate.getForObject("http://EB-PRO/hi?name="+name,String.class);
	}

}