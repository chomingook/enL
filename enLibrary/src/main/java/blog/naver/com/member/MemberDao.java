package blog.naver.com.member;

import java.util.List;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;

public interface MemberDao {

	/*�쉶�썝媛��엯�벑濡앹떊泥�*/
	int insertmember(Member member);
	
	/*�룄�꽌�벑濡�*/
	int insertbooks(Books books);
	
	/*愿�由ъ옄�벑濡�*/
	int insertadmin(Admin admin);
	
	/*�룄�꽌愿��벑濡�*/
	int insertlib(Lib lib);
	
	/*�쉶�썝媛��엯紐⑸줉(�듅�씤x)*/	
	List<Member> selectList();
	
	int updatement(String MEMBER_ID);
	
	/*���뿬�뿉�꽌 �쉶�썝�젙蹂� 媛��졇�삤湲�*/
	Member selectBm(String MEMBER_ID);
	
	
}
