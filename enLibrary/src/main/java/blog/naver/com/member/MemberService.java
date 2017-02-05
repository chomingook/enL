package blog.naver.com.member;

import java.util.List;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;

public interface MemberService {

	/*�쉶�썝�벑濡앹떊泥�*/
	int getMember(Member member);
	
	/*�룄�꽌�벑濡�*/
	int getBooks(Books books);
	
	/*愿�由ъ옄�벑濡�*/
	int getAdmin(Admin admin);
	
	/*�룄�꽌愿��벑濡�*/
	int getLib(Lib lib);
	
	/*�쉶�썝媛��엯紐⑸줉(�듅�씤x)*/	
	List<Member> getList();
	
	Member getBm(String MEMBER_ID);
	
	int updatement(String[] MEMBER_ID);
	
}
