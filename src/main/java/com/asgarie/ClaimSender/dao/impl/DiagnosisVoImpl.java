package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.DiagnosisVoDao;
import com.asgarie.ClaimSender.entity.ask.DiagnosisVo;
import com.asgarie.ClaimSender.entity.mappers.DiagnosisVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiagnosisVoImpl implements DiagnosisVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DiagnosisVo> getList(Integer sepasId) {
        String sql = "select * from DiagnosisVo";
        RowMapper<DiagnosisVo> rowMapper = new DiagnosisVoMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}
