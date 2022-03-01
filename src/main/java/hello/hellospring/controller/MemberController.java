package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

//  생성자 injection 방식
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

//    setter injection 방식
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
}


