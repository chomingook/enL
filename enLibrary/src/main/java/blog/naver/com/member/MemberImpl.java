package blog.naver.com.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.dto.Rental;

@Repository
public class MemberImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public final String Member_NS = "blog.naver.com.member.MemberMapper.";
	
	//회원가입신청insert
	@Override
	public int insertmember(Member member) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "memberAdd", member);
	}

	//책등록
	@Override
	public int insertbooks(Books books) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "booksAdd", books);
	}

	//관리자로그인세션 젤 마지막 
	@Override
	public int insertadmin(Admin admin) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "adminAdd", admin);
	}
	
	//도서관등록
	@Override
	public int insertlib(Lib lib) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "libAdd", lib);
	}
	//회원 리스트 가져오기
	@Override
	public List<Member> selectList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(Member_NS + "selectment");
	}

	//대여할때 조회로 아이디에 이름 주소 가져오기
	@Override
	public Member selectBm(String MEMBER_ID) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(Member_NS + "rentalmember", MEMBER_ID);
	}
	//회원승인(Y)
	@Override
	public int updatement(String MEMBER_ID) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(Member_NS + "updatement", MEMBER_ID);
	}
	//대여할때 조회로 코드 입력후 이름 가져오기
	@Override
	public Books selectBB(int BOOK_CODE) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(Member_NS + "rentalbooks", BOOK_CODE);
	}
	//도서폐기등록 
	@Override
	public int bookdeleteinsert(Books books) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "bookdeleteinsert", books);
	}
	//도서폐기후 도서대여상태를 N 사용불가로 만들기
	@Override
	public int bookdeleteupdate(int BOOK_CODE) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(Member_NS + "bookdeleteupdate", BOOK_CODE);
	}
	//대여정보 등록
	@Override
	public int bookrentalInsert(Rental rental) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "bookrentalInsert", rental);
	}
	//도서반납시 반납 완료후 Y값으로 변환
	@Override
	public int returnupdate(int retalCode) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(Member_NS + "returnupdate", retalCode);
	}
	//대여 날짜 가져오기
	@Override
	public Rental returnRental(int retalCode) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(Member_NS + "returnRental", retalCode);
	}

	


	

}
