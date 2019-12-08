package wang.ismy.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import wang.ismy.dubbo.pojo.User;
import wang.ismy.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MY
 * @date 2019/12/8 16:18
 */
// 声明这是一个dubbo服务

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    {
        System.out.println("服务载入");
    }
    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("cxk"+i);
            user.setId((long)i);
            list.add(user);
        }
        return list;
    }
}
