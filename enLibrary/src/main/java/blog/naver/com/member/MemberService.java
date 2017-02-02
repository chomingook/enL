package blog.naver.com.member;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;

public interface MemberService {

	/*회원등록신청*/
	int getMember(Member member);
	
	/*도서등록*/
	int getBooks(Books books);
	
	/*관리자등록*/
	int getAdmin(Admin admin);
	
	/*도서관등록*/
	int getLib(Lib lib);
}
