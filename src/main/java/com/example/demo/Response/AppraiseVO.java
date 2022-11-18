package com.example.demo.Response;

import com.example.demo.Model.AppraiseModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class AppraiseVO {
    private Integer status = -2;
    private String code = "";
    private String msg = "";
    private List<AppraiseModel> allComments;
}
