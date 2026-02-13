package lk.ijse.aad.backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RequestMapping
//@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

//    @GetMapping
//    public String index() {
//        return "index";
//    }


