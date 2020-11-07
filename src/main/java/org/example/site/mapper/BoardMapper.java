package org.example.site.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.site.domain.BoardVO;

import java.util.List;

public interface BoardMapper {
    // 쿼리 테스트를 마친후 xml파일을 만들고 쿼리부분 주석 후 다시 테스트코드를 실행해서 정상적으로 작동하는지 확인

    //@Select("select * from tbl_board where bno > 0")
    public List<BoardVO> getList();

    public void insert(BoardVO board);

    public void insertSelectKey(BoardVO board);

    public BoardVO read(Long bno);

    public int delete(Long bno);

    public int update(BoardVO board);
}
