package com.app.board.mapper;

import com.app.board.domain.ReplyDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReplyMapper {

    @Select("select * from tbl_reply where bno=#{bno}")
    List<ReplyDTO> selectAll(int bno);


    @Select("select * from tbl_reply where rno=#{rno}")
    ReplyDTO selectByRno(int rno);


    @Insert("INSERT INTO tbl_reply (bno,reply,replyer) VALUES (#{bno}, #{reply}, #{replyer})")
    @Options(useGeneratedKeys = true, keyProperty = "rno", keyColumn = "rno")
    int insertReply(ReplyDTO replyDTO);



}
