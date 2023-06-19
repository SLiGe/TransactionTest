package cn.zjiali.test.transaction.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private Integer age;

    @Column(name = "ts")
    private LocalDateTime ts;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setTs(LocalDateTime ts) {
        this.ts = ts;
    }

    public LocalDateTime getTs() {
        return ts;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId + '\'' +
                "username=" + username + '\'' +
                "password=" + password + '\'' +
                "age=" + age + '\'' +
                "ts=" + ts + '\'' +
                '}';
    }
}
