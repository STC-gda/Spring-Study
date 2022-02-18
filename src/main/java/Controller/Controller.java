package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Demo1")
public class Controller {
    @GetMapping("show1")
    public String demo1(){
        return "Hello Hell!";
    }
}
