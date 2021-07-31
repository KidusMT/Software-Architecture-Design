package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {
 
    @GetMapping("/validate")
    public String isNumberPrime(@RequestParam("number1") Integer number1, @RequestParam("number2") Integer number2) {
        return number1 % 2 == 0 && number1 % 2 == 0 ? "Even" : "Odd";
    }
} 
