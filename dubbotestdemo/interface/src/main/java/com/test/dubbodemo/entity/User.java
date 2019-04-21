package com.test.dubbodemo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private  long id;
    private String name;
}
