package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.DiagnosisVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DiagnosisVoMapper implements RowMapper<DiagnosisVo> {

    @Override
    public DiagnosisVo mapRow(ResultSet row, int rowNum) throws SQLException {
        DiagnosisVo diagnosisVo = new DiagnosisVo();
        diagnosisVo.setId(CommonUtils.handleNull(row.getString("ID")));
        diagnosisVo.setComment(row.getString("Comment"));
        diagnosisVo.setDiagnosisCode(row.getString("DiagnosisCode"));
        diagnosisVo.setDiagnosisMonth(CommonUtils.handleNull(row.getString("DiagnosisYear")));
        diagnosisVo.setDiagnosisMonth(CommonUtils.handleNull(row.getString("DiagnosisMonth")));
        diagnosisVo.setDiagnosisDay(CommonUtils.handleNull(row.getString("DiagnosisDay")));
        diagnosisVo.setDiagnosisHour(CommonUtils.handleNull(row.getString("DiagnosisHour")));
        diagnosisVo.setDiagnosisMinute(CommonUtils.handleNull(row.getString("DiagnosisMinute")));
        diagnosisVo.setDiagnosisSecond(CommonUtils.handleNull(row.getString("DiagnosisSecond")));
        diagnosisVo.setSeverityValue(CommonUtils.handleNull(row.getString("SeverityValue")));
        diagnosisVo.setSeveritySymbolCode(row.getString("SeveritySymbolCode"));
        diagnosisVo.setStatusCode(row.getString("StatusCode"));
        diagnosisVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return diagnosisVo;
    }

}
