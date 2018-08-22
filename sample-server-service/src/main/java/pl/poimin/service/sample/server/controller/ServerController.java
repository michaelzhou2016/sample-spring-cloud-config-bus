package pl.poimin.service.sample.server.controller;

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
@RestController
@RequestMapping(path = "server")
public class ServerController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Integer> list() {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(22);
        list.add(75);
        list.add(93);
        list.add((int)(Math.random() * 10000));
        return list;
    }
}
