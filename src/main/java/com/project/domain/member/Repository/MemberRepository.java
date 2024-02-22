package com.project.domain.member.Repository;


import com.project.domain.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 사용자 이름으로 회원 찾기
    Member findByUsername(String username);
}