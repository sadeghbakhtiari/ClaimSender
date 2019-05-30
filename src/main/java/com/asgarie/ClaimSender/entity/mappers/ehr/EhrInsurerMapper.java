package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrInsurer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrInsurerMapper implements RowMapper<EhrInsurer> {

    @Override
    public EhrInsurer mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrInsurer ehrInsurer = new EhrInsurer();
        ehrInsurer.setCode(row.getString("code"));
        ehrInsurer.setValue(row.getString("value"));
        return ehrInsurer;
    }
}
