package com.example.demo.Service;


import com.example.demo.Dao.ApplyDao;
import com.example.demo.Dao.AppraiseDao;
import com.example.demo.Dao.AppraiseRepository;
import com.example.demo.Model.ApplyModel;
import com.example.demo.Model.AppraiseModel;
import com.example.demo.Response.ApplyVO;
import com.example.demo.Response.AppraiseVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppraiseServiceImpl implements AppraiseService {

    @Resource
    private AppraiseRepository appraiseRepository;

    @Override
    public String AppraiseUpdate(AppraiseModel appraiseModel) {

        Integer Seq = -1;
        Seq = appraiseRepository.CountSeq() + 1;
        System.out.println(Seq);

        AppraiseDao appraiseDao = new AppraiseDao();

        appraiseDao.setSeq(Seq);
        appraiseDao.setId(appraiseModel.getId());
        appraiseDao.setAppraise(appraiseModel.getAppraise());
        appraiseDao.setProvider(appraiseModel.getProvider());

        appraiseRepository.save(appraiseDao);

        return "Suc/ucessful add leave info To DB";
    }

    @Override
    public AppraiseVO GetAllAppraise() {
        List<Object[]> AppraiseInfos = appraiseRepository.GetAppraise();
        System.out.println(AppraiseInfos.size());
        List<AppraiseModel> allAppraiseInfos = new ArrayList<>();

        for (Object[] objects : AppraiseInfos) {

            System.out.println(Arrays.toString(objects));

            AppraiseModel appraiseModel = new AppraiseModel();
            appraiseModel.setSeq((Integer)objects[0]);
            appraiseModel.setId((String) objects[2]);
            appraiseModel.setAppraise((String) objects[1]);
            appraiseModel.setProvider((String)objects[3]);

            allAppraiseInfos.add(appraiseModel);
        }
        return AppraiseVO.builder().msg("TODO").status(1).code("200").allComments(allAppraiseInfos).build();
    }
}
