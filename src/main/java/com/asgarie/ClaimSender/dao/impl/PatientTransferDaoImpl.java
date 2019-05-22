package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.PatientTransferDao;
import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import com.asgarie.ClaimSender.entity.mappers.AdmissionVoMapper;
import com.asgarie.ClaimSender.entity.mappers.PatientTransferMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PatientTransferDaoImpl implements PatientTransferDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    @Override
    public List<PatientTransfer> getAllPatientTransferList() {
        String sql = "select * from PatientTransfer";
        RowMapper<PatientTransfer> rowMapper = new PatientTransferMapper();
        return this.jdbcTemplate.query(sql,rowMapper);
    }
}
