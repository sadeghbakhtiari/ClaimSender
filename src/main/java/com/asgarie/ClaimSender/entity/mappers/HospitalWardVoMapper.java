package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.HospitalWardVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalWardVoMapper implements RowMapper<HospitalWardVo> {

    @Override
    public HospitalWardVo mapRow(ResultSet row, int rowNum) throws SQLException {
        HospitalWardVo hospitalWardVo = new HospitalWardVo();
//        hospitalWardVo.setHospitalWardVOFK(CommonUtils.handleNull(row.getString("HospitalWardVOFK")));
        hospitalWardVo.setBed(row.getString("Bed"));
        hospitalWardVo.setName(row.getString("Name"));
        hospitalWardVo.setRoom(row.getString("Room"));
        hospitalWardVo.setTypeCode(row.getString("TypeCode"));
        hospitalWardVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return hospitalWardVo;
    }

}
