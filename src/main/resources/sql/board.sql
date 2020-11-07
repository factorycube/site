-- 보드 테이블 삭제
drop table tbl_board;
-- 보드 테이블 생성
create table tbl_board(
    bno int auto_increment not null primary key,
    title varchar(200) not null,
    content text not null,
    writer varchar(50) not null,
    regdate timestamp not null default now(),
    updatedate timestamp default now()
);
-- 보드 테이블 전체 조회
select * from tbl_board;
-- 보드 데이터 생성
insert into tbl_board (bno, title, content, writer)
values (bno, '테스트제목', '테스트내용', 'user00');

SELECT max(bno)+1 from tbl_board;