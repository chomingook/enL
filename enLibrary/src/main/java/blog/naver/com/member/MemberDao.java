package blog.naver.com.member;

import java.util.List;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;

public interface MemberDao {

	/*회원가입등록신청*/
	int insertmember(Member member);
	
	/*도서등록*/
	int insertbooks(Books books);
	
	/*관리자등록*/
	int insertadmin(Admin admin);
	
	/*도서관등록*/
	int insertlib(Lib lib);
	
	/*회원가입목록(승인x)*/	
	List<Member> selectList();
	
	/*대여에서 회원정보 가져오기*/
	Member selectBm(String MEMBER_ID);
	
	
}
