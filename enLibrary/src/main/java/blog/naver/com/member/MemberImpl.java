package blog.naver.com.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import blog.naver.com.dto.Member;

@Repository
public class MemberImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public final String Member_NS = "blog.naver.com.member.MemberMapper.";
	
	
	@Override
	public int insertmember(Member member) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(Member_NS + "memberAdd", member);
	}

}
