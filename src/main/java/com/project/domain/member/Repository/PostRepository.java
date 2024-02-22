package com.project.domain.member.Repository;


import com.project.domain.member.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 필요에 따라 추가 메서드 정의
}