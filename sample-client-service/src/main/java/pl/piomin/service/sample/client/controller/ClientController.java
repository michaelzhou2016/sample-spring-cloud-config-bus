package pl.piomin.service.sample.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.service.sample.client.config.ClientConfiguration;
import pl.piomin.service.sample.client.feign.MFeignClient;

import java.util.List;

@Slf4j
@RestController
public class ClientController {

	@Autowired
	private ClientConfiguration conf;

	@Autowired
	private MFeignClient feignClient;
	
	@GetMapping("/list")
	public ResponseEntity<List<Integer>> list() {
		log.info("test list");
		return feignClient.list();
	}

	@GetMapping("/ping")
	public String ping() {
		return conf.showProperties();
	}
	
}
