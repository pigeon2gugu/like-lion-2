package com.mustache.bbs4.domain.repository;

import com.mustache.bbs4.domain.Article;
import com.mustache.bbs4.domain.Hospital;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    List<Hospital> findByBusinessTypeNameIn(List<String> businessTypes);

    List<Hospital> findByRoadNameAddressContaining(String keyword); // 포함
    List<Hospital> findByHospitalNameStartsWith(String keyword); // 시작
    List<Hospital> findByHospitalNameEndsWith(String keyword); // 끝남

    List<Hospital> findByPatientRoomCountBetween(int a, int b);
    
    //내림차순까지 포함
    List<Hospital> findByPatientRoomCountBetweenOrderByPatientRoomCountDesc(int a, int b);

    Page<Hospital> findByRoadNameAddressContaining(String keyword, Pageable pageable);

}
