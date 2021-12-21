package top.diruipu.aaa.gateway.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author diruipu
 * @create 2021-12-21 5:35 PM
 * @ClassName IndexController
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public Mono<String> index() {
        return Mono.just("cloud gateway");
    }
}