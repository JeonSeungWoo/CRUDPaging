create table tbl_board(
bno int PRIMARY key,
title VARCHAR(200),
content varchar(200),
insertDate varchar(100)
)

select * from tbl_board;

CREATE SEQUENCE seq_board START 1;

select currval('seq_board');


