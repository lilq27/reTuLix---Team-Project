package com.tis.admin.service;

import java.util.List;

import com.tis.common.model.PagingVO;
import com.tis.retulix.domain.NoticeVO;

/* XXXServiceImpl 만들때 반드시 @Service 어노테이션 붙여주고 value를 지정해주자 */
public interface NoticeService {

	/* 공지사항 */
	int getTotalNotice();	//공지사항 총 개수
	int getTotalSearchNotice(PagingVO paging);	//검색한 공지사항 개수
	List<NoticeVO> getNoticeList(PagingVO paging);	//모든공지사항 가져오기
	List<NoticeVO> getSearchNotice(PagingVO paging);	//검색한 공지사항 가져오기
	NoticeVO getNoticeByIdx(String idx);	//idx로 공지사항 하나 가져오기
	
	int updateClick(String idx);	//공지사항볼때 조회수 1증가
	
	int insertNotice(NoticeVO vo);	//공지사항 작성
	int updateNotice(NoticeVO vo);	//공지사항 수정
	int deleteNotice(String idx);	//idx로 공지사항 삭제
	
}
