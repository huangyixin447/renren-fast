package io.renren.modules.exam.entity.form;

import lombok.Data;

import java.io.Serializable;

/**
 *  @author timelocked
 * @Date 2023/1/14 19:44
 **/
@Data
public class LoginForm implements Serializable {

    private String account;
    private String password;
}
