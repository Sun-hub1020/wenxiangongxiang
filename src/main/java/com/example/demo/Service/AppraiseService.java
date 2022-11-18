package com.example.demo.Service;

import com.example.demo.Model.ApplyModel;
import com.example.demo.Model.AppraiseModel;
import com.example.demo.Response.AppraiseVO;

public interface AppraiseService {
    public String AppraiseUpdate(AppraiseModel appraiseModel);

    public AppraiseVO GetAllAppraise();
}
