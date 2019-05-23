package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.HospitalWardVoDao;
import com.asgarie.ClaimSender.entity.ask.HospitalWardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalWardVoDaoImpl implements HospitalWardVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public HospitalWardVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM HospitalWardVo WHERE SepasID = ?";
        RowMapper<HospitalWardVo> rowMapper = new BeanPropertyRowMapper<>(HospitalWardVo.class);
        HospitalWardVo hospitalWardVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return hospitalWardVo;
    }
}
