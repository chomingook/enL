package blog.naver.com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.naver.com.dto.Admin;
import blog.naver.com.dto.Books;
import blog.naver.com.dto.Lib;
import blog.naver.com.dto.Member;
import blog.naver.com.dto.Rental;
import blog.naver.com.member.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberService memberService;
	
	//대여 폼
		@RequestMapping(value="/Lbooks/bookrental", method=RequestMethod.GET)
		public String rentalmember(){
			return "/Lbooks/bookrental";
		}
	
	//대여 action
		@RequestMapping(value="/Lbooks/bookrental", method=RequestMethod.POST)
			public String rentalmember(Rental rental){
			memberService.rentalInsert(rental);
				return "/Lbooks/bookrental";
			
			
		}
	
	
	
	
	
	//반납 폼
	@RequestMapping(value="/Lbooks/bookreturn", method=RequestMethod.GET)
		public String bookreturn(){
			logger.info("returnbook");
			return "/Lbooks/bookreturn";
	}
	//반납 action
	@RequestMapping(value="/Lbooks/bookreturn", method=RequestMethod.POST)
		public String bookreturn(Books books){
		logger.info("return action");
		logger.info("books return :" + books.toString());
		return "/Lbooks/bookreturn";
	}
	
	
	
	
	//폐기 폼
	@RequestMapping(value="/Lbooks/deletebooks", method=RequestMethod.GET)
		public String deletebooks(){
		logger.info("deleteinsert form");
		return "/Lbooks/deletebooks";
	}
	//폐기 action(안받아짐)
	@RequestMapping(value="/Lbooks/deletebooks", method=RequestMethod.POST)
		public String deletebooks(Books books){
		logger.info("BOOK_CODE : " + books.toString());
		int BOOK_CODE = books.getBOOK_CODE();
		memberService.deleteinsert(books);
		memberService.bookdeleteupdate(BOOK_CODE);
		
		return "/Lbooks/deletebooks";
	}
	
	
	
	//대여 회원 정보
	@RequestMapping(value="/Lbooks/bookmember", method=RequestMethod.POST)
		public @ResponseBody Member rentalmember(@RequestParam(value="MEMBER_ID") String MEMBER_ID){
		System.out.println("memberId : "+MEMBER_ID);
		Member returnMb = memberService.getBm(MEMBER_ID);
		logger.info(returnMb.toString());
		return returnMb;
	}
	
	
	//대여 도서 정보
	@RequestMapping(value="/Lbooks/selectrental", method=RequestMethod.POST)
		public @ResponseBody Books rentalbooks(@RequestParam(value="BOOK_CODE")int BOOK_CODE){
		System.out.println("BOOK_CODE : "+BOOK_CODE);
		Books returnBB = memberService.getselectBB(BOOK_CODE);
		logger.info(returnBB.toString());
			return returnBB;
	}
	
	//회원 리스트 가져오기
	@RequestMapping(value="/member/management")
	public String selectment(Model model){
		model.addAttribute("list", memberService.getList());
		return "/member/management";
		
	}
	//회원승인
	@RequestMapping(value="/member/management", method=RequestMethod.POST)
		public String updatement(@RequestParam(value="MEMBER_ID")String[] MEMBER_ID){
		memberService.updatement(MEMBER_ID);
			return "/member/management";
		
	}
	
	
	//메인화면 폼
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(){
		return "index";
		
	}
	//회원가입신청insert 폼
	@RequestMapping(value = "/member/memberAdd", method = RequestMethod.GET)
	public String memberAdd() {
		return "/member/memberAdd";
	}

	//회원가입신청insert action
	@RequestMapping(value = "/member/memberAdd", method = RequestMethod.POST)
	public String memberAdd(Member member) {
		memberService.getMember(member);
		return "/member/memberAdd";
	}
 
	//책등록 폼
	@RequestMapping(value = "/Lbooks/booksAdd", method = RequestMethod.GET)
	public String booksAdd() {
		return "/Lbooks/booksAdd";
	}

	//책등록 action
	@RequestMapping(value = "/Lbooks/booksAdd", method = RequestMethod.POST)
	public String booksAdd(Books books) {
		memberService.getBooks(books);
		return "/Lbooks/booksAdd";
	}

	//관리자로그인세션 젤 마지막 
	@RequestMapping(value = "/admins/adminAdd", method = RequestMethod.GET)
	public String adminAdd() {
		return "/admins/adminAdd";
	}

	//관리자로그인세션 젤 마지막 
	@RequestMapping(value = "/admins/adminAdd", method = RequestMethod.POST)
	public String adminAdd(Admin admin) {
		memberService.getAdmin(admin);
		return "index";
	}

	//도서관등록 폼
	@RequestMapping(value = "/member/libAdd", method = RequestMethod.GET)
	public String libAdd() {
		return "/member/libAdd";
	}
	//도서관등록 action
	@RequestMapping(value = "/member/libAdd", method = RequestMethod.POST)
	public String libAdd(Lib lib) {
		memberService.getLib(lib);
		return "/member/libAdd";
	}

}
