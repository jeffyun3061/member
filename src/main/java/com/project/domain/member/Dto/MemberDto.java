package com.project.domain.member.Dto;

public class MemberDto {
    private String username;
    private String email;
    private String password; // password 필드 추가

    // Getter와 Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { // getPassword 메서드 추가
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}