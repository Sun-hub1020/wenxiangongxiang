package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppraiseRepository extends JpaRepository<AppraiseDao,String> {

    @Query(value = "select count(*) from appraise_dao ",nativeQuery = true)
    Integer CountSeq();

    @Query(value = "SELECT * FROM appraise_dao",nativeQuery = true)
    List<Object[]> GetAppraise();
}
