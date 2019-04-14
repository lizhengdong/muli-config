package tv.muli.muliconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jory
 * @date 2019-03-20
 */
@RestController
public class AliveController {

    @RequestMapping("/")
    public String index() {
        return "muli config java!";
    }

    @RequestMapping("/alive")
    public String alive() {
        return "alive!";
    }
}
