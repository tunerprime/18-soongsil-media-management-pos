package mikyeong.pos.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	@RequestMapping("/")
    public @ResponseBody String root_test() throws Exception{
        return "Hello World";
    }

}
