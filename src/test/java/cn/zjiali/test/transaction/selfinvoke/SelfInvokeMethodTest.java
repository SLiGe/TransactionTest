package cn.zjiali.test.transaction.selfinvoke;

import cn.zjiali.test.transaction.entity.SysUser;
import cn.zjiali.test.transaction.repository.SysUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
public class SelfInvokeMethodTest {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Test
    @Transactional(rollbackFor = Exception.class)
    public void testInsertUser() {
        SysUser sysUser = new SysUser();
        sysUser.setAge(10);
        sysUser.setPassword("123");
        sysUser.setUsername("gary");
        sysUser.setTs(LocalDateTime.now());
        SysUser save = sysUserRepository.save(sysUser);
        System.out.println("save: " + save);
        testUpdateUser(save.getUserId());
    }

    @Transactional(rollbackFor = Exception.class)
    public void testUpdateUser(Integer id) {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(id);
        sysUser.setAge(11);
        sysUser.setPassword("1233");
        sysUser.setUsername("gary");
        SysUser update = sysUserRepository.save(sysUser);
        System.out.println("update: " + update);
        throw new RuntimeException();
    }

}
