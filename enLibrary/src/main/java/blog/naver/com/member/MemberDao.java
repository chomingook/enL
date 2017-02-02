package blog.naver.com.member;

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
	
	int selectmember();
	
}
