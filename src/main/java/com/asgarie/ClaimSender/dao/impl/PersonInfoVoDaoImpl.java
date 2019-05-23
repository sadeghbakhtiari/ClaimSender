package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.PersonInfoVoDao;
import com.asgarie.ClaimSender.entity.ask.BillSummaryVo;
import com.asgarie.ClaimSender.entity.ask.PersonInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonInfoVoDaoImpl implements PersonInfoVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public PersonInfoVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM PersonInfoVo WHERE SepasID = ?";
        RowMapper<PersonInfoVo> rowMapper = new BeanPropertyRowMapper<>(PersonInfoVo.class);
        PersonInfoVo personInfoVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return personInfoVo;
    }
}
