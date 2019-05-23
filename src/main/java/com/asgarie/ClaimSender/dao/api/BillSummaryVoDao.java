package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.BillSummaryVo;

public interface BillSummaryVoDao {
    BillSummaryVo getById(Integer sepasId);

}
