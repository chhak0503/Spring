package kr.co.ch05.controller;

import kr.co.ch05.dto.MemberDTO;
import kr.co.ch05.mapper.MemberMapper;
import kr.co.ch05.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/search")
    public String search(@RequestParam("type") String type, @RequestParam("value") String value, Model model){

        System.out.println("type : " + type);
        System.out.println("value : " + value);

        List<MemberDTO> members = memberService.selectMembersForSearch(type, value);
        System.out.println(members);

        model.addAttribute("members", members);

        return "/member/list";
    }

    @GetMapping("/member/list")
    public String list(Model model){

        System.out.println("list...");
        List<MemberDTO> members = memberService.selectMembers();
        model.addAttribute("members", members);

        return "/member/list";
    }

    @GetMapping("/member/register")
    public String register(){
        return "/member/register";
    }

    @PostMapping("/member/register")
    public String register(MemberDTO memberDTO){

        memberService.insertMember(memberDTO);


        return "redirect:/member/list";
    }

}
