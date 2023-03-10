package com.example.demo.src.user.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
/*

 */
public class GetUserRes {
    private int userIdx;
    private String nickname;
    private String email;
    private String phoneNumber;
    private float mannerTemp;
    private int reDealHopeRate;
    private int responseRate;
    private Timestamp createdAt;
}
