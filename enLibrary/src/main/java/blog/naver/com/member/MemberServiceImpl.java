package blog.naver.com.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	
	/*회원가입등록신청*/
	@Override
	public int getMember(Member member) {
		// TODO Auto-generated method stub
		return memberDao.insertmember(member);
	}
	/*도서등록*/
	@Override
	public int getBooks(Books books) {
		// TODO Auto-generated method stub
		return memberDao.insertbooks(books);
	}
	/*관리자등록*/
	@Override
	public int getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return memberDao.insertadmin(admin);
	}
	@Override
	public int getLib(Lib lib) {
		// TODO Auto-generated method stub
		return memberDao.insertlib(lib);
	}

}
