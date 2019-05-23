package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.InsuranceVoDao;
import com.asgarie.ClaimSender.entity.ask.InsuranceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class InsuranceVoDaoImpl implements InsuranceVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public InsuranceVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM InsuranceVo WHERE SepasID = ?";
        RowMapper<InsuranceVo> rowMapper = new BeanPropertyRowMapper<>(InsuranceVo.class);
        InsuranceVo insuranceVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return insuranceVo;
    }
}
