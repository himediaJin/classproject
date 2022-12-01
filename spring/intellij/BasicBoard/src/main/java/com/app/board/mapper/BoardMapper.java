package com.app.board.mapper;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.ReplyDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("select * from tbl_board")
    List<BoardDTO> selectAll();

    @Select("select * from tbl_board order by bno desc limit #{start}, #{count}")
    List<BoardDTO> selectList(@Param("start") int start, @Param("count") int count);

    @Select("select count(*) from tbl_board")
    int selectTotalCount();

    @Select("select * from tbl_board where bno=#{bno}")
    BoardDTO selectByBno(int bno);

    @Insert("insert into tbl_board (title, content, writer) values (#{title}, #{content}, #{writer})")
    int insertBoardContent(BoardDTO boardDTO);

    @Update("update tbl_board set title=#{title}, content=#{content}, writer=#{writer}, updatedate=now() where bno=#{bno}")
    int updateBoardArticle(BoardDTO boardDTO);

    @Delete("delete from tbl_board where bno=#{bno}")
    int deleteBoardArticle(int bno);
}
