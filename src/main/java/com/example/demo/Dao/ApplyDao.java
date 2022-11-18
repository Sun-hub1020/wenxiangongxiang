package com.example.demo.Dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApplyDao {
//    @EmbeddedId
//    ApplyID ids;
    @Id
    private String Id;

    private int Category;
    private String Header;
    private String Author;
    private String Abstract;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//    private Date Publishtime;
    private int Source;
    private int Format;
    private int Grade;
//    private String Appraise;

    private String Provider;

}
