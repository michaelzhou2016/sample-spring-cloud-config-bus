package pl.poimin.service.sample.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/8/22 14:13
 */
@Slf4j
@RestController
@RequestMapping(path = "server")
public class ServerController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<List<Integer>> list() {
        log.info("server list");
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(22);
        list.add(75);
        list.add(93);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Cache-Control", "no-cache");
        return new ResponseEntity<>(list, httpHeaders, HttpStatus.OK);
    }
}
