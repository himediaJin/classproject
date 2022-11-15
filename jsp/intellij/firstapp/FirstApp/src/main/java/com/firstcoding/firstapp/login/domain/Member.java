package com.firstcoding.firstapp.login.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Member {

    private int idx;
    private String uid;
    private String pw;
    private String uuid;

}
