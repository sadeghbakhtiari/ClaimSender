package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.CauseVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CauseVoMapper implements RowMapper<CauseVo> {

    @Override
    public CauseVo mapRow(ResultSet row, int rowNum) throws SQLException {
        CauseVo causeVo = new CauseVo();
        causeVo.setId(CommonUtils.handleNull(row.getString("ID")));
        causeVo.setCauseCode(row.getString("CauseCode"));
        causeVo.setStatusCode(row.getString("StatusCode"));
        causeVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return causeVo;
    }

}
