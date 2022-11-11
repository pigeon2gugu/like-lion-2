package com.mustache.bbs4.domain.repository;

import com.mustache.bbs4.domain.Article;
import com.mustache.bbs4.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}