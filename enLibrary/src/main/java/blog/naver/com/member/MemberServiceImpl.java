package blog.naver.com.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Receiver;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.dto.Rental;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	
	/*�쉶�썝媛��엯�벑濡앹떊泥�*/
	
	@Override
	public int getMember(Member member) {
		member.setMEMBER_PAYMENTSTATUS('N');
		member.setRENTAL_COUNT(0);
		
		return memberDao.insertmember(member);
	}
	/*�룄�꽌�벑濡�*/
	@Override
	public int getBooks(Books books) {
		books.setBOOK_CURRENTSTATUS('Y');
		books.setBOOK_RENTALCOUNT(0);
		books.setBOOK_RENTALDAYS(0);
		
		return memberDao.insertbooks(books);
	}
	/*愿�由ъ옄�벑濡�*/
	@Override
	public int getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return memberDao.insertadmin(admin);
	}
	/*�룄�꽌愿��벑濡�*/
	@Override
	public int getLib(Lib lib) {
		// TODO Auto-generated method stub
		return memberDao.insertlib(lib);
	}
	
	/*�쉶�썝媛��엯紐⑸줉(�듅�씤x)*/		
	@Override
	public List<Member> getList() {
		
		return memberDao.selectList();
	}
	
	@Override
	public Member getBm(String MEMBER_ID) {
		
		
		
		return memberDao.selectBm(MEMBER_ID);
	}
	@Override
	public int updatement(String[] MEMBER_ID) {
		int result=0;
		for(int i=0; i<MEMBER_ID.length; i++){
			result=memberDao.updatement(MEMBER_ID[i]);
		}
		return result;
	}
}


