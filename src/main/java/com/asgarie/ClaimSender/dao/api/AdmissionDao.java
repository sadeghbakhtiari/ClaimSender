package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.AdmissionVo;

import java.util.List;

public interface AdmissionDao {
    List<AdmissionVo> getAllAdmission();
    AdmissionVo getById(Integer sepasId);
}
