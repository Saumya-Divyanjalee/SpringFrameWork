package lk.ijse.aad.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer/")
public class CustomerController {
    @GetMapping("index1")
    public String index(){
        return "Hello World! 1";
    }
    @GetMapping("index2")
    public String index2(){
        return "Hello World! 2";
    }
    @GetMapping("index3")
    public String index3(){
        return "Hello World! 3";
    }
    @PostMapping
    public String post(){
        return "Hello World! 4";
    }
    @DeleteMapping
    public String delete(){
        return "Hello World! 5";
    }
    @PutMapping
    public String put(){
        return "Hello World! 6";
    }
    @PatchMapping
    public String patch(){
        return "Hello World! 7";
    }

}
