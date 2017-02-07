package blog.naver.com.member;

import java.util.List;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.dto.Payment;
import blog.naver.com.dto.Rental;

public interface MemberDao {

	// 회원가입신청insert
	int insertmember(Member member);

	// 책등록
	int insertbooks(Books books);

	// 관리자로그인세션 젤 마지막
	Admin adminAdd(String ADMIN_ID);

	// 도서관등록
	int insertlib(Lib lib);

	// 회원 리스트 가져오기
	List<Member> selectList();

	// 회원승인
	int updatement(String MEMBER_ID);

	// 대여할때 조회로 아이디에 이름 주소 가져오기
	Member selectBm(String MEMBER_ID);

	// 대여할때 조회로 코드 입력후 이름 가져오기
	Books selectBB(int BOOK_CODE);

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
	
	// 결제등록
	int paymentInsert(Payment payment);

}
