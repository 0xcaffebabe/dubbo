package wang.ismy.dubbo.service;

import wang.ismy.dubbo.pojo.User;

import java.util.List;

/**
 * @author MY
 * @date 2019/12/8 16:17
 */
public interface UserService {

    List<User> findAll();
}
