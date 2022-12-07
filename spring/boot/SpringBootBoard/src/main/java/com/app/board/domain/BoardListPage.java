package com.app.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    // 페이지당 출력할 게시물의 개수
    private int countPerPage;

    // 현재 페이지 번호
    private int pageNum;

    // 게시물의 리스트
    private List<BoardDTO> list;

    // 전체 게시물의 개수
    private int totalCount;

    // 페이징의 시작 번호
    private int startNum;
    
    // 페이직의 끝 번호
    private int endNum;

    // 이전 번튼 출력 여부
    private boolean prev;

    // 다음 버튼 출력 여부
    private boolean next;

    public BoardListPage(
            int countPerPage,
            int pageNum,
            List<BoardDTO> list,
            int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();
    }

    private void calPageInfo() {

        // 끝번호
        this.endNum = (int)(Math.ceil((this.pageNum * 1.0) / 10)) * 10;    // 11 -> 11.0 / 10 -> 1.1 -> 2.0 -> 2 * 10
        this.startNum = this.endNum-9;

        int realEndNum =    (int)( Math.ceil((this.totalCount * 1.0) / countPerPage));

        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

        this.prev = this.startNum > 1;

        this.next = this.endNum < realEndNum;
    }
}
