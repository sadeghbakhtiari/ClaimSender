package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrGender;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrGenderMapper implements RowMapper<EhrGender> {

    @Override
    public EhrGender mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrGender ehrGender = new EhrGender();
        ehrGender.setCode(row.getString("code"));
        ehrGender.setValue(row.getString("value"));
        return ehrGender;
    }
}
