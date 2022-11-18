package com.example.demo.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.Model.ApplyModel;
import com.example.demo.Model.AppraiseModel;
import com.example.demo.Response.ApplyVO;
import com.example.demo.Response.AppraiseVO;
import com.example.demo.Service.AppraiseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class WxAppraiseController {
    @Resource
    AppraiseService appraiseService;

    @PostMapping("/AppraiseUpdate")
    public JSONObject AppraiseUpdate(@RequestBody AppraiseModel appraiseModel) {
        JSONObject ret = new JSONObject();
        try {
            String msg  = appraiseService.AppraiseUpdate(appraiseModel);
            System.out.println(appraiseModel.toString());
            ret.put("success", true);
            ret.put("exc", "");
        }
        catch (Exception e) {
            ret.put("succes" +
                    "s", false);
            e.printStackTrace();
            ret.put("exc", e.getMessage());
        }
        return ret;
    }

    @GetMapping("/GetAppraise")
    public AppraiseVO GetAllApplyInfos(){
        return appraiseService.GetAllAppraise();
    }

}
