package com.example.pathfinder.model.binding;

import com.example.pathfinder.validation.register.UniqueEmail;
import com.example.pathfinder.validation.register.UniqueUsername;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProfileUpdateBindingModel {
  private Long id;
  private Integer age;
  private String fullName;
  private String email;
  private String username;
  private String facebookLink;
  private String instagramLink;
  private String linkedInLink;
  private String emailAccount;
  private String description;

  public ProfileUpdateBindingModel() {
  }

  @UniqueUsername
  @Size(min = 4,max = 20, message = "Username must be between 4 and 20 symbols")
  public String getUsername() {
    return username;
  }

  public Long getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  @Positive(message = "Age must be positive")
  public Integer getAge() {
    return age;
  }

  @Size(min = 3, max = 30, message = "Full name must be between 3 and 30 symbols")
  public String getFullName() {
    return fullName;
  }

  @NotNull(message = "Email is required")
  @UniqueEmail
  public String getEmail() {
    return email;
  }

  public String getFacebookLink() {
    return facebookLink;
  }

  public String getInstagramLink() {
    return instagramLink;
  }

  public String getLinkedInLink() {
    return linkedInLink;
  }

  public String getEmailAccount() {
    return emailAccount;
  }

  public ProfileUpdateBindingModel setAge(Integer age) {
    this.age = age;
    return this;
  }

  public ProfileUpdateBindingModel setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public ProfileUpdateBindingModel setEmail(String email) {
    this.email = email;
    return this;
  }

  public ProfileUpdateBindingModel setFacebookLink(String facebookLink) {
    this.facebookLink = facebookLink;
    return this;
  }

  public ProfileUpdateBindingModel setInstagramLink(String instagramLink) {
    this.instagramLink = instagramLink;
    return this;
  }

  public ProfileUpdateBindingModel setLinkedInLink(String linkedInLink) {
    this.linkedInLink = linkedInLink;
    return this;
  }

  public ProfileUpdateBindingModel setEmailAccount(String emailAccount) {
    this.emailAccount = emailAccount;
    return this;
  }

  public ProfileUpdateBindingModel setDescription(String description) {
    this.description = description;
    return this;
  }

  public ProfileUpdateBindingModel setId(Long id) {
    this.id = id;
    return this;
  }

  public ProfileUpdateBindingModel setUsername(String username) {
    this.username = username;
    return this;
  }
}
