package shop.mtcoding.boardproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {
    
    @GetMapping("/test/log")
    public String log(){
        log.trace(null);
        return "log ok";
    }
}
