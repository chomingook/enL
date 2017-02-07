package blog.naver.com.member;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.dto.Payment;
import blog.naver.com.dto.Rental;

public interface MemberService {
	static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	// 회원가입신청insert
	int getMember(Member member);

	// 책등록
	int getBooks(Books books);

	// 관리자로그인세션 젤 마지막
	Admin adminAdd(Admin admin);

	// 도서관등록
	int getLib(Lib lib);

	// 회원 리스트 가져오기
	List<Member> getList();

	// 대여할때 조회로 아이디에 이름 주소 가져오기
	Member getBm(String MEMBER_ID);

	// 회원승인
	int updatement(String[] MEMBER_ID);

	// 대여할때 조회로 코드 입력후 이름 가져오기
	Books getselectBB(int BOOK_CODE);

	// 도서폐기등록
	int bookdeleteinsert(Books books);

	// 도서폐기후 도서대여상태를 N 사용불가로 만들기
	int bookdeleteupdate(int BOOK_CODE);

	// 대여정보 등록
	int bookrentalInsert(Rental rental);

	// 도서반납시 반납 완료후 Y값으로 변환
	int returnupdate(int retalCode);

	// 대여 날짜 가져오기
	Rental returnRental(int retalCode);
	
	//결제등록
	int paymentInsert(Payment payment);

}
