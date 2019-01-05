package com.moon.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: faker
 * @Date:2019/1/4
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private int Id;

    private String name;

    private String userName;

    private String passWord;

    private String mobile;

    private Date createTime;
}
