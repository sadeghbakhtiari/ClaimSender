package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrAadmisionType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrAadmisionTypeMapper implements RowMapper<EhrAadmisionType> {

    @Override
    public EhrAadmisionType mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrAadmisionType ehrAadmisionType = new EhrAadmisionType();
        ehrAadmisionType.setCode(row.getString("code"));
        ehrAadmisionType.setValue(row.getString("value"));
        return ehrAadmisionType;
    }
}
