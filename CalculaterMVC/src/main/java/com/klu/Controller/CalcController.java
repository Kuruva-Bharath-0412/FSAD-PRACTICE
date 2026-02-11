package com.klu.Controller;

import org.springframework.web.bind.annotation.*;

import com.klu.Service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private  CalcService service;

    // Constructor Injection (BEST PRACTICE)
    public CalcController(CalcService service) {
        this.service = service;
    }

    // http://localhost:8080/calculator/add?a=10&b=5
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // http://localhost:8080/calculator/sub/10/5
    @GetMapping("/sub/{a}/{b}")
    public int sub(@PathVariable int a, @PathVariable int b) {
        return service.sub(a, b);
    }

    // http://localhost:8080/calculator/mul/10/5
    @GetMapping("/mul/{a}/{b}")
    public int mul(@PathVariable int a, @PathVariable int b) {
        return service.mul(a, b);
    }

    // http://localhost:8080/calculator/div?a=10&b=4
    @GetMapping("/div")
    public double div(@RequestParam int a, @RequestParam int b) {
        return service.div(a, b);
    }

    // http://localhost:8080/calculator/mod/10/3
    @GetMapping("/mod/{a}/{b}")
    public int mod(@PathVariable int a, @PathVariable int b) {
        return service.mod(a, b);
    }
}
