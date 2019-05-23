package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.BillPatientCompositionVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BillPatientCompositionVoMapper implements RowMapper<BillPatientCompositionVo> {

    @Override
    public BillPatientCompositionVo mapRow(ResultSet row, int rowNum) throws SQLException {
        BillPatientCompositionVo admissionVo = new BillPatientCompositionVo();
        admissionVo.setCompositionUid(row.getString("CompositionUID"));
        admissionVo.setPatientUid(row.getString("PatientUID"));
        admissionVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return admissionVo;
    }

}
