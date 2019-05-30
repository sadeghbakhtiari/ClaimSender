package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrWardType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrWardTypeMapper implements RowMapper<EhrWardType> {

    @Override
    public EhrWardType mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrWardType ehrWardType = new EhrWardType();
        ehrWardType.setCode(row.getString("code"));
        ehrWardType.setValue(row.getString("value"));
        return ehrWardType;
    }
}
