package blog.naver.com.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.naver.com.dto.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int getMember(Member member) {
		// TODO Auto-generated method stub
		return memberDao.insertmember(member);
	}

}
