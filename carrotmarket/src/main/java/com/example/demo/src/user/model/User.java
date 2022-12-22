package com.example.demo.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private int userIdx;
    private String nickname;
    private String email;
    private String phoneNumber;
    private float mannerTemp;
    private int reDealHopeRate;
    private int responseRate;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    status char status;
}
