package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrMedicalRecordType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrMedicalRecordTypeMapper implements RowMapper<EhrMedicalRecordType> {

    @Override
    public EhrMedicalRecordType mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrMedicalRecordType ehrMedicalRecordType = new EhrMedicalRecordType();
        ehrMedicalRecordType.setCode(row.getString("code"));
        ehrMedicalRecordType.setValue(row.getString("value"));
        return ehrMedicalRecordType;
    }
}
