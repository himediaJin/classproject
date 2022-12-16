package com.app.board.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_reply")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rno;

    @Column
    private Integer bno;

    @Column
    private String reply;

    @Column
    private String replyer;

    @Column(insertable = false)
    private String replydate;

    @Column(insertable = false)
    private String updatedate;

}
