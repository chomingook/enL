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
	
	/*�쉶�썝媛��엯�벑濡앹떊泥�*/
	@Override
	public int insertmember(Member member) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "memberAdd", member);
	}

	/*�룄�꽌�벑濡�*/
	@Override
	public int insertbooks(Books books) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "booksAdd", books);
	}

	/*愿�由ъ옄�벑濡�*/
	@Override
	public int insertadmin(Admin admin) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "adminAdd", admin);
	}
	
	/*�룄�꽌愿��벑濡�*/
	@Override
	public int insertlib(Lib lib) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "libAdd", lib);
	}
	/*�쉶�썝媛��엯紐⑸줉(�듅�씤x)*/	
	@Override
	public List<Member> selectList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(Member_NS + "selectment");
	}

	/*���뿬�뿉�꽌 �쉶�썝�젙蹂� 媛��졇�삤湲�*/
	@Override
	public Member selectBm(String MEMBER_ID) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(Member_NS + "rentalmember", MEMBER_ID);
	}

	@Override
	public int updatement(String MEMBER_ID) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(Member_NS + "updatement", MEMBER_ID);
	}


	

}
