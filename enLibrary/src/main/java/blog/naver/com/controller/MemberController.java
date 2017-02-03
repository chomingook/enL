package blog.naver.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.member.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	/*대여 : member 아이디를 통해 주소값 이름 전화번호 가져오기 ajax*/
	@RequestMapping(value="/Lbooks/bookrental", method=RequestMethod.POST)
		public Member rentalmember(Model model, @RequestParam(value="MEMBER_ID") String MEMBER_ID){
		Member returnMb = memberService.getBm(MEMBER_ID);
		return returnMb;
	}
	
	@RequestMapping(value="/Lbooks/bookrental", method=RequestMethod.GET)
		public String rentalmember(){
			return "/Lbooks/bookrental";
	}
	
	/*회원가입목록(승인x)*/	
	@RequestMapping(value="/member/management")
	public String selectment(Model model){
		model.addAttribute("list", memberService.getList());
		return "/member/management";
		
	}
	
	/*index 폼 시작*/
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(){
		return "index";
		
	}
	/* 회원등록 폼 */
	@RequestMapping(value = "/member/memberAdd", method = RequestMethod.GET)
	public String memberAdd() {
		return "/member/memberAdd";
	}

	/* 회원등록 action */
	@RequestMapping(value = "/member/memberAdd", method = RequestMethod.POST)
	public String memberAdd(Member member) {
		memberService.getMember(member);
		return "/member/memberAdd";
	}

	/* 도서 등록 폼 */
	@RequestMapping(value = "/Lbooks/booksAdd", method = RequestMethod.GET)
	public String booksAdd() {
		return "/Lbooks/booksAdd";
	}

	/* 도서 등록 action */
	@RequestMapping(value = "/Lbooks/booksAdd", method = RequestMethod.POST)
	public String booksAdd(Books books) {
		memberService.getBooks(books);
		return "/Lbooks/booksAdd";
	}

	/* 관리자 로그인 폼  수정해야함*/
	@RequestMapping(value = "/admins/adminAdd", method = RequestMethod.GET)
	public String adminAdd() {
		return "/admins/adminAdd";
	}

	/* 관리자 로그인 action 수정해야함*/
	@RequestMapping(value = "/admins/adminAdd", method = RequestMethod.POST)
	public String adminAdd(Admin admin) {
		memberService.getAdmin(admin);
		return "index";
	}

	/*도서관 등록 폼*/
	@RequestMapping(value = "/member/libAdd", method = RequestMethod.GET)
	public String libAdd() {
		return "/member/libAdd";
	}
	/*도서관 등록 action*/
	@RequestMapping(value = "/member/libAdd", method = RequestMethod.POST)
	public String libAdd(Lib lib) {
		memberService.getLib(lib);
		return "/member/libAdd";
	}

}
