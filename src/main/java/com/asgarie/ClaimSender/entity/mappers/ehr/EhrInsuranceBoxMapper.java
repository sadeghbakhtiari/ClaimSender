package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrInsuranceBox;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrInsuranceBoxMapper implements RowMapper<EhrInsuranceBox> {

    @Override
    public EhrInsuranceBox mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrInsuranceBox ehrInsuranceBox = new EhrInsuranceBox();
        ehrInsuranceBox.setCode(row.getString("code"));
        ehrInsuranceBox.setValue(row.getString("value"));
        return ehrInsuranceBox;
    }
}
