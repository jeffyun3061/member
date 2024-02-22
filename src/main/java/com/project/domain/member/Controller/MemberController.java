package com.project.domain.member.Controller;

import com.project.domain.member.Dto.MemberDto;
import com.project.domain.member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<String> registerMember(@RequestBody MemberDto memberDto) {
        memberService.registerMember(memberDto);
        return ResponseEntity.ok("Member registered successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDto> getMemberById(@PathVariable Long id) {
        MemberDto memberDto = memberService.getMemberById(id);
        return ResponseEntity.ok(memberDto);
    }
}