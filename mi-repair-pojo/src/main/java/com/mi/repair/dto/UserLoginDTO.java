package com.mi.repair.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Kuroko
 * @description
 * @date 2024/5/13 21:42
 */
@Data
public class UserLoginDTO implements Serializable {

    private String userName;

    private String password;
}
