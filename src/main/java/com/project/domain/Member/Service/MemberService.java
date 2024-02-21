package com.project.domain.Member.Service;

import com.project.domain.Member.Member;
import java.util.List;

public interface MemberService {
    List<Member> findAllMembers();
}