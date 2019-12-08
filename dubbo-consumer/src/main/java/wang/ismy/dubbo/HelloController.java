package wang.ismy.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.ismy.dubbo.pojo.User;
import wang.ismy.dubbo.service.UserService;

import java.util.List;

/**
 * @author MY
 * @date 2019/12/8 17:05
 */
@RestController
@Controller
public class HelloController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("")
    public List<User> list(){
        return userService.findAll();
    }
}
