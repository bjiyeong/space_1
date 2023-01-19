package com.project.space.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewVO {
	private int review_num;  //글번호
	private String userid; //회원아이디 (mem_info)
	private int snum; //공간번호 fk
	private String rpwd;  //글비밀번호
	private String rtitle;  //글제목
	private String rcontent;  //글내용
	private Date review_date;  //작성일
	private int readnum;  //조회수
	private int rscore;  //별점
	private String rimage1;
	private String rimage2;
	private int rgroup;  //글 그룹
	private int rlevel; //답변레벨
	private int rgorder;  //같은 그룹내의 순서
}
