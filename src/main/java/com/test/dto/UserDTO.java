package com.test.dto;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class UserDTO {

	@ApiModelProperty(value = "用户ID", required = true)
    private int id;

	@ApiModelProperty(value = "名称", required = true)
    private String name;

	@ApiModelProperty(value = "年龄", required = true)
    private int age;

	@ApiModelProperty(value = "地址", required = true)
    private String address;
    
    public UserDTO(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public UserDTO(){}
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Age=" + age + ", Address=" + address;
    }
}
