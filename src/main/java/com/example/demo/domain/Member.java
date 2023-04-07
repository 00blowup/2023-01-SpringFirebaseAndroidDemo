package com.example.demo.domain;

import lombok.Data;

@Data
public class Member {
    private String id;

    private String nickname;
    private String password;

    public Member (String id, String nickname, String password){
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }


    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
