package com.project.domain.Member;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Integer generation;
    private String profileImage;
    private String role;
    private String socialAuthCode;
    private String delyn;

    // 기본 생성자
    public Member() {
    }

    // 모든 매개변수를 갖는 생성자
    public Member(Long id, String name, String email, String password, String phoneNumber, Integer generation, String profileImage, String role, String socialAuthCode, String delyn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.generation = generation;
        this.profileImage = profileImage;
        this.role = role;
        this.socialAuthCode = socialAuthCode;
        this.delyn = delyn;
    }

    // get,set
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public Integer getGeneration() { return generation; }
    public void setGeneration(Integer generation) { this.generation = generation; }
    public String getProfileImage() { return profileImage; }
    public void setProfileImage(String profileImage) { this.profileImage = profileImage; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getSocialAuthCode() { return socialAuthCode; }
    public void setSocialAuthCode(String socialAuthCode) { this.socialAuthCode = socialAuthCode; }
    public String getDelyn() { return delyn; }
    public void setDelyn(String delyn) { this.delyn = delyn; }
}