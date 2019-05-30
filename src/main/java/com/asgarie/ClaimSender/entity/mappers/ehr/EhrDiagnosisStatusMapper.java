package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrDiagnosisStatus;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrDiagnosisStatusMapper implements RowMapper<EhrDiagnosisStatus> {

    @Override
    public EhrDiagnosisStatus mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrDiagnosisStatus ehrDiagnosisStatus = new EhrDiagnosisStatus();
        ehrDiagnosisStatus.setCode(row.getString("code"));
        ehrDiagnosisStatus.setValue(row.getString("value"));
        return ehrDiagnosisStatus;
    }
}
