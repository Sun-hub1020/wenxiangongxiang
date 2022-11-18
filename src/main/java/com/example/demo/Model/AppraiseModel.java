package com.example.demo.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class AppraiseModel {
    private Integer Seq;
    private String Id;
    private String Appraise;
    private String Provider;
}
