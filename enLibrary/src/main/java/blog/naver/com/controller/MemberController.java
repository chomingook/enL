package blog.naver.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import blog.naver.com.dto.Member;
import blog.naver.com.member.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value="/member/memberAdd", method=RequestMethod.POST)
	public String memberAdd(Member member){
		memberService.getMember(member);
		return "/member/memberAdd";
		
	}
	
	@RequestMapping(value="/member/memberAdd", method=RequestMethod.GET)// get요청방식
	public String memberAdd(){
		return "/member/memberAdd";
	}
}
