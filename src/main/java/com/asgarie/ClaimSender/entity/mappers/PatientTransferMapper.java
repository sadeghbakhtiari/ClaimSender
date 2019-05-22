package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientTransferMapper implements RowMapper<PatientTransfer> {
    @Override
    public PatientTransfer mapRow(ResultSet row, int rowNum) throws SQLException {

        PatientTransfer patientTransfer = new PatientTransfer();
        patientTransfer.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        patientTransfer.setParNo(CommonUtils.handleNull(row.getString("Par_No")));
        patientTransfer.setBastaryNum(CommonUtils.handleNull(row.getString("Bastary_Num")));
        patientTransfer.setCompositionUid(row.getString("CompositionUID"));
        patientTransfer.setPatientUid(row.getString("PatientUID"));
        patientTransfer.setSend(Boolean.parseBoolean(row.getString("Send")));
        patientTransfer.setStatus(CommonUtils.handleNull(row.getString("Status")));
        patientTransfer.setkDate(row.getString("KDate"));
        patientTransfer.setkTime(row.getTimestamp("KTime"));
        patientTransfer.setOperNo(CommonUtils.handleNull(row.getString("Oper_No")).shortValue());
        patientTransfer.setkDateSend(row.getString("KdateSend"));
        patientTransfer.setkTimeSend(row.getTimestamp("KtimeSend"));

        return patientTransfer;
    }
}
