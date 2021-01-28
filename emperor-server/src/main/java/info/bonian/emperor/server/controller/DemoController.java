package info.bonian.emperor.server.controller;

import info.bonian.emperor.server.generator.LeafProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author here
 * @date 2021/1/28 1:50 下午
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private LeafProperty leaf;

    @GetMapping("/yml")
    public String getObject(){

        return leaf.toString();
    }
}
