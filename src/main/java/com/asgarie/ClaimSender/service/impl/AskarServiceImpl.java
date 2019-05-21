package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.dao.api.AdmissionDao;
import com.asgarie.ClaimSender.entity.asg.AdmissionVo;
import com.asgarie.ClaimSender.service.api.AskarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AskarServiceImpl implements AskarService {

    @Autowired
    private AdmissionDao admissionDao;

    @Override
    public AdmissionVo getAdmissionVo(Integer sepasId) {
        return admissionDao.getAdmissionVo(sepasId);
    }
}
