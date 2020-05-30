package me.sangoh.echo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/echo/{text}")
    @ResponseBody
    public String echo(@PathVariable("text") String text) {
        return text;
    }
}
