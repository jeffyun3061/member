package com.project.domain.Member.Service;


import com.project.domain.Member.Member;
import com.project.domain.Member.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService_2 implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService_2(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }
}