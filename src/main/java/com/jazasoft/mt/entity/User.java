package com.jazasoft.mt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jazasoft.mt.Role;

@Entity
@Table(name = "people", indexes = @Index(columnList = "name,email"))
public class User extends BaseEntity implements Serializable{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "active")
    private boolean active;

    @JsonIgnore
    @Column(name = "retry_count")
    private Integer retryCount;

    @JsonIgnore
    @Column(name = "otp")
    private String otp;

    @JsonIgnore
    @Column(name = "blocked_at")
    private Date blockedAt;

    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "otp_sent_at")
    private Date otpSentAt;

    public User() {
    }

    public User(String name, String username, String email, String password, String role, String mobile) {
        this.name = name;
        this.username = username;
        this.email = email;
        setPassword(password);
        this.role = role;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return Role.parse(role);
    }

    public void setRole(Role role) {
        this.role = role.getValue();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public Date getBlockedAt() {
        return blockedAt;
    }

    public void setBlockedAt(Date blockedAt) {
        this.blockedAt = blockedAt;
    }

    public Date getOtpSentAt() {
        return otpSentAt;
    }

    public void setOtpSentAt(Date otpSentAt) {
        this.otpSentAt = otpSentAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
