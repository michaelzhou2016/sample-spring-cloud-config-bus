package pl.piomin.service.sample.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "sample-server-service")
public interface MFeignClient {
    @RequestMapping(value = "/server/list", method = RequestMethod.GET)
    ResponseEntity<List<Integer>> list();
}
