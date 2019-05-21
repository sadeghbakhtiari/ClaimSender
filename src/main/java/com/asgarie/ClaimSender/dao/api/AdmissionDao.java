package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.asg.AdmissionVo;

public interface AdmissionDao {
    AdmissionVo getAdmissionVo(Integer sepasId);
}
