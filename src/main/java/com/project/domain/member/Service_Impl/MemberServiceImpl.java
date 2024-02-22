package com.project.domain.member.Service_Impl;

import com.project.domain.member.Dto.MemberDto;
import com.project.domain.member.model.Member;
import com.project.domain.member.Repository.MemberRepository;
import com.project.domain.member.Service.MemberService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper; // ModelMapper 주입

    @Override
    public void registerMember(MemberDto memberDto) {
        Member member = modelMapper.map(memberDto, Member.class); // DTO를 Entity로 변환
        member.setPassword(passwordEncoder.encode(memberDto.getPassword())); // 비밀번호 암호화
        memberRepository.save(member);
    }

    @Override
    public MemberDto getMemberById(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Member not found with id: " + id));
        MemberDto dto = modelMapper.map(member, MemberDto.class); // Entity를 DTO로 변환
        // DTO에서는 비밀번호를 반환하지 않습니다.
        return dto;
    }
}