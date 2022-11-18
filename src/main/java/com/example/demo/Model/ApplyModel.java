package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class ApplyModel {
//    private String Openid;

    private String Id;
    private int Category;
    private String Header;
    private String Author;
    private String Abstract;

//    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//    private Date Publishtime;
    private int Source;
    private int Format;
    private int Grade;
//    private String Appraise;
    private String Provider;

//    private String Location;
//    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
//    private Date Time;
//
//    private int Type;
//    private int Reason;
//    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
//    private Date Starttime;
//    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
//    private Date Endtime;
//    private String Schedule = null;
//    private String Traffictools = null;
//    private String Destination = null;
//    private int Permit=-1;
}
