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
    private String townName;
    private String userPhoto;
}