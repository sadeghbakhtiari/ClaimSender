package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.AbstractDao;
import com.asgarie.ClaimSender.entity.asg.AdmissionVo;
import com.asgarie.ClaimSender.dao.api.AdmissionDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AdmissionDaoImpl extends AbstractDao<Integer, AdmissionVo> implements AdmissionDao {

    @Override
    @Transactional(readOnly = true)
    public AdmissionVo getAdmissionVo(Integer sepasId) {
        return getByKey(sepasId);
    }
}
