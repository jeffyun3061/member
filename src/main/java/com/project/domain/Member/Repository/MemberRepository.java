package com.project.domain.Member.Repository;


import com.project.domain.Member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}