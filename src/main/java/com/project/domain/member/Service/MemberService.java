package com.project.domain.member.Service;


import com.project.domain.member.Dto.MemberDto;

public interface MemberService {
    void registerMember(MemberDto memberDto);
    MemberDto getMemberById(Long id);
}