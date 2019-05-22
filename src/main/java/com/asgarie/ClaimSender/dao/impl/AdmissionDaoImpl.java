package com.asgarie.ClaimSender.dao.impl;


import com.asgarie.ClaimSender.dao.api.AdmissionDao;
import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.mappers.AdmissionVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AdmissionDaoImpl implements AdmissionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Transactional(readOnly = true)
    @Override
    public List<AdmissionVo> getAllAdmission() {
        String sql = "select * from AdmissionVO";
        RowMapper<AdmissionVo> rowMapper = new AdmissionVoMapper();
        return this.jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public AdmissionVo getById(Integer sepasId) {
        String sql = "SELECT  * FROM AdmissionVO WHERE SepasID = ?";
        RowMapper<AdmissionVo> rowMapper = new BeanPropertyRowMapper<>(AdmissionVo.class);
        AdmissionVo admissionVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return admissionVo;
    }
}
