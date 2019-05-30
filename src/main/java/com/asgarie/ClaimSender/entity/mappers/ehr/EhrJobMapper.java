package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrJob;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrJobMapper implements RowMapper<EhrJob> {

    @Override
    public EhrJob mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrJob ehrJob = new EhrJob();
        ehrJob.setCode(row.getString("code"));
        ehrJob.setValue(row.getString("value"));
        return ehrJob;
    }
}
