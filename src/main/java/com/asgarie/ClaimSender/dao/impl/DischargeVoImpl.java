package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.DischargeVoDao;
import com.asgarie.ClaimSender.entity.ask.DischargeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DischargeVoImpl implements DischargeVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public DischargeVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM DischargeVo WHERE SepasID = ?";
        RowMapper<DischargeVo> rowMapper = new BeanPropertyRowMapper<>(DischargeVo.class);
        DischargeVo dischargeVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return dischargeVo;
    }
}
