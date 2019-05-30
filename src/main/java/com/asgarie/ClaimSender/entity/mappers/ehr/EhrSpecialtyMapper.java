package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrSpecialty;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrSpecialtyMapper implements RowMapper<EhrSpecialty> {

    @Override
    public EhrSpecialty mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrSpecialty ehrSpecialty = new EhrSpecialty();
        ehrSpecialty.setCode(row.getString("code"));
        ehrSpecialty.setValue(row.getString("value"));
        return ehrSpecialty;
    }
}
