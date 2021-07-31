package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/add")
    public String add(@RequestParam("value1") Integer value1,
                      @RequestParam("value2") Integer value2) {
        return value1+value2+"";
    }
}
