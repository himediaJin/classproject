package com.app.board.domain;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReplyDTO {

    private int rno;
    private int bno;
    private String reply;
    private String replyer;
    private LocalDate replydate;
    private LocalDate updatedate;

}
