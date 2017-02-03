package blog.naver.com.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;

@Repository
public class MemberImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public final String Member_NS = "blog.naver.com.member.MemberMapper.";
	
	/*회원가입등록신청*/
	@Override
	public int insertmember(Member member) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "memberAdd", member);
	}

	/*도서등록*/
	@Override
	public int insertbooks(Books books) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "booksAdd", books);
	}

	/*관리자등록*/
	@Override
	public int insertadmin(Admin admin) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "adminAdd", admin);
	}
	
	/*도서관등록*/
	@Override
	public int insertlib(Lib lib) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "libAdd", lib);
	}
	/*회원가입목록(승인x)*/	
	@Override
	public List<Member> selectList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(Member_NS + "selectment");
	}

	/*대여에서 회원정보 가져오기*/
	@Override
	public Member selectBm(String MEMBER_ID) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(Member_NS + "rentalmember", MEMBER_ID);
	}


	

}
