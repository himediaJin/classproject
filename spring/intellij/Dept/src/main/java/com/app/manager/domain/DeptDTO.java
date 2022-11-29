package com.app.manager.domain;

import lombok.*;

import javax.validation.constraints.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DeptDTO {

    @Min(value = 1)
    @Max(value = 99)
    @Positive
    private int deptno;

    @NotEmpty  // 문자열은 비어있는 않은 상태, List->요소의 개수가 비어있는지
    private String dname;

    @NotEmpty   // "" fail " " pass
    private String loc;

}

// @Future : 현재 시간보다 미래이어야 한다!
// @Email : 이메일 체크
// @NotBlank : 공백 문자열도 체크 " " fail
// @NotNull : Null 값이 아니다