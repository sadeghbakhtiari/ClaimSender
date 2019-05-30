package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrServiceType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrServiceTypeMapper implements RowMapper<EhrServiceType> {

    @Override
    public EhrServiceType mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrServiceType ehrServiceType = new EhrServiceType();
        ehrServiceType.setCode(row.getString("code"));
        ehrServiceType.setValue(row.getString("value"));
        return ehrServiceType;
    }
}
