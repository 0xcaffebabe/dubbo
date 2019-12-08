package wang.ismy.dubbo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author MY
 * @date 2019/12/8 16:15
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1;

    private Long id;
    private String username;
    private String password;
    private Integer age;
}
