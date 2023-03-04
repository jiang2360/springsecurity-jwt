package com.bjpowernode.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void selectByUsername() {
        System.out.println(sysUserMapper.selectByUsername("admin"));
    }

    @Test
    void selectPermissionById() {
        System.out.println(sysUserMapper.selectPermissionById(2L));
    }
}