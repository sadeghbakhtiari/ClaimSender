package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.BasicDeathDetailsVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BasicDeathDetailsVoMapper implements RowMapper<BasicDeathDetailsVo> {

    @Override
    public BasicDeathDetailsVo mapRow(ResultSet row, int rowNum) throws SQLException {
        BasicDeathDetailsVo basicDeathDetailsVo = new BasicDeathDetailsVo();
        basicDeathDetailsVo.setDeathYear(CommonUtils.handleNull(row.getString("DeathYear")));
        basicDeathDetailsVo.setDeathMonth(CommonUtils.handleNull(row.getString("DeathMonth")));
        basicDeathDetailsVo.setDeathDay(CommonUtils.handleNull(row.getString("DeathDay")));
        basicDeathDetailsVo.setDeathHour(CommonUtils.handleNull(row.getString("DeathHour")));
        basicDeathDetailsVo.setDeathMinute(CommonUtils.handleNull(row.getString("DeathMinute")));
        basicDeathDetailsVo.setDeathSecond(CommonUtils.handleNull(row.getString("DeathSecond")));
        basicDeathDetailsVo.setDeathLocationCode(row.getString("DeathLocationCode"));
        basicDeathDetailsVo.setHospitalWardVo(CommonUtils.handleNull(row.getString("HospitalWard_HospitalWardVOFK")));
         basicDeathDetailsVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return basicDeathDetailsVo;
    }

}
