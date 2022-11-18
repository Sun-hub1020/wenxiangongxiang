package com.example.demo.Dao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class AppraiseDao {

    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Seq;
    private String Id;
    private String Appraise;
    private String Provider;
}
