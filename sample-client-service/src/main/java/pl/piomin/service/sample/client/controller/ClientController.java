package pl.piomin.service.sample.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.service.sample.client.config.ClientConfiguration;
import pl.piomin.service.sample.client.feign.MFeignClient;

@RestController
public class ClientController {

	@Autowired
	private ClientConfiguration conf;

	@Autowired
	private MFeignClient feignClient;
	
	@GetMapping("/ping")
	public String ping() {
		return feignClient.list().toString();
	}

	@GetMapping("/list")
	public String list() {
		return conf.showProperties();
	}
	
}
