package blog.naver.com.controller;


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
import blog.naver.com.member.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	/*���뿬 : member �븘�씠�뵒瑜� �넻�빐 二쇱냼媛� �씠由� �쟾�솕踰덊샇 媛��졇�삤湲� ajax*/
	@RequestMapping(value="/Lbooks/bookrental", method=RequestMethod.POST)
		public @ResponseBody Member rentalmember(@RequestParam(value="MEMBER_ID") String MEMBER_ID){
		Member returnMb = memberService.getBm(MEMBER_ID);
		return returnMb;
	}
	
	@RequestMapping(value="/Lbooks/bookrental", method=RequestMethod.GET)
		public String rentalmember(){
			return "/Lbooks/bookrental";
	}
	
	/*�쉶�썝媛��엯紐⑸줉(�듅�씤x)*/	
	@RequestMapping(value="/member/management")
	public String selectment(Model model){
		model.addAttribute("list", memberService.getList());
		return "/member/management";
		
	}
	
	@RequestMapping(value="/member/management", method=RequestMethod.POST)
		public String updatement(@RequestParam(value="MEMBER_ID")String[] MEMBER_ID){
		memberService.updatement(MEMBER_ID);
			return "/member/management";
		
	}
	
	
	/*index �뤌 �떆�옉*/
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(){
		return "index";
		
	}
	/* �쉶�썝�벑濡� �뤌 */
	@RequestMapping(value = "/member/memberAdd", method = RequestMethod.GET)
	public String memberAdd() {
		return "/member/memberAdd";
	}

	/* �쉶�썝�벑濡� action */
	@RequestMapping(value = "/member/memberAdd", method = RequestMethod.POST)
	public String memberAdd(Member member) {
		memberService.getMember(member);
		return "/member/memberAdd";
	}

	/* �룄�꽌 �벑濡� �뤌 */
	@RequestMapping(value = "/Lbooks/booksAdd", method = RequestMethod.GET)
	public String booksAdd() {
		return "/Lbooks/booksAdd";
	}

	/* �룄�꽌 �벑濡� action */
	@RequestMapping(value = "/Lbooks/booksAdd", method = RequestMethod.POST)
	public String booksAdd(Books books) {
		memberService.getBooks(books);
		return "/Lbooks/booksAdd";
	}

	/* 愿�由ъ옄 濡쒓렇�씤 �뤌  �닔�젙�빐�빞�븿*/
	@RequestMapping(value = "/admins/adminAdd", method = RequestMethod.GET)
	public String adminAdd() {
		return "/admins/adminAdd";
	}

	/* 愿�由ъ옄 濡쒓렇�씤 action �닔�젙�빐�빞�븿*/
	@RequestMapping(value = "/admins/adminAdd", method = RequestMethod.POST)
	public String adminAdd(Admin admin) {
		memberService.getAdmin(admin);
		return "index";
	}

	/*�룄�꽌愿� �벑濡� �뤌*/
	@RequestMapping(value = "/member/libAdd", method = RequestMethod.GET)
	public String libAdd() {
		return "/member/libAdd";
	}
	/*�룄�꽌愿� �벑濡� action*/
	@RequestMapping(value = "/member/libAdd", method = RequestMethod.POST)
	public String libAdd(Lib lib) {
		memberService.getLib(lib);
		return "/member/libAdd";
	}

}
