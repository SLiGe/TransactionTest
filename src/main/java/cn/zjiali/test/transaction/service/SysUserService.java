package cn.zjiali.test.transaction.service;

import cn.zjiali.test.transaction.entity.SysUser;
import cn.zjiali.test.transaction.repository.SysUserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SysUserService {

    private final SysUserRepository sysUserRepository;

    public SysUserService(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    public void insertUser(){
        SysUser sysUser = new SysUser();
        sysUser.setAge(10);
        sysUser.setPassword("123");
        sysUser.setUsername("gary");
        sysUser.setTs(LocalDateTime.now());
        SysUser save = sysUserRepository.save(sysUser);
        System.out.println("save: " + save);
    }
}
