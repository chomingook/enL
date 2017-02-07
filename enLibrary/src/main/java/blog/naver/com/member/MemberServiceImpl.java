package blog.naver.com.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.dto.Rental;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	
	//회원가입신청insert
	
	@Override
	public int getMember(Member member) {
		member.setMEMBER_PAYMENTSTATUS('N');
		member.setRENTAL_COUNT(0);
		
		return memberDao.insertmember(member);
	}
	//책등록
	@Override
	public int getBooks(Books books) {
		books.setBOOK_CURRENTSTATUS('Y');
		books.setBOOK_RENTALCOUNT(0);
		books.setBOOK_RENTALDAYS(0);
		
		return memberDao.insertbooks(books);
	}
	//관리자로그인세션 젤 마지막 
	@Override
	public int getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return memberDao.insertadmin(admin);
	}
	//도서관등록
	@Override
	public int getLib(Lib lib) {
		// TODO Auto-generated method stub
		return memberDao.insertlib(lib);
	}
	
	//회원 리스트 가져오기
	@Override
	public List<Member> getList() {
		
		return memberDao.selectList();
	}
	//대여할때 조회로 아이디에 이름 주소 가져오기
	@Override
	public Member getBm(String MEMBER_ID) {
		
		return memberDao.selectBm(MEMBER_ID);
	}
	//회원승인
	@Override
	public int updatement(String[] MEMBER_ID) {
		int result=0;
		for(int i=0; i<MEMBER_ID.length; i++){
			result=memberDao.updatement(MEMBER_ID[i]);
		}
		return result;
	}
	//대여할때 조회로 코드 입력후 이름 가져오기
	@Override
	public Books getselectBB(int BOOK_CODE) {
		// TODO Auto-generated method stub
		return memberDao.selectBB(BOOK_CODE);
	}
	//도서폐기등록 
	@Override
	public int bookdeleteinsert(Books books) {
		// TODO Auto-generated method stub
		return memberDao.bookdeleteinsert(books);
	}
	//도서폐기후 도서대여상태를 N 사용불가로 만들기
	@Override
	public int bookdeleteupdate(int BOOK_CODE) {
		// TODO Auto-generated method stub
		return memberDao.bookdeleteupdate(BOOK_CODE);
	}
	
	//도서 대여 등록
	@Override
	public int bookrentalInsert(Rental rental) {
		rental.setReturnStatus('N');
		return memberDao.bookrentalInsert(rental);
	}
	//도서반납시 반납 완료후 Y값으로 변환
	@Override
	public int returnupdate(int retalCode) {
		// TODO Auto-generated method stub
		return memberDao.returnupdate(retalCode);
	}
	//대여 날짜 가져오기
	@Override
	public Rental returnRental(int retalCode) {
		// TODO Auto-generated method stub
		return memberDao.returnRental(retalCode);
	}
	
}


