package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.PatientTransferDao;
import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import com.asgarie.ClaimSender.entity.mappers.AdmissionVoMapper;
import com.asgarie.ClaimSender.entity.mappers.PatientTransferMapper;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import model.ws.ir.gov.behdasht.thrita.vm.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Transactional(readOnly = true)
    @Override
    public List<PatientTransfer> getNewPatientTransferList() {
        String sql = "select top 100 * from PatientTransfer where Send=false";
        RowMapper<PatientTransfer> rowMapper = new PatientTransferMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }
    @Transactional
    @Override
    public void updatePatientTransfer(Integer sepasId, ResultVO resultVO) {
        String sql = "update PatientTransfer  set CompositionUID=?" +
                ",PatientUID=?,send=?,status=?,KdateSend=?,KtimeSend=?  where sepasId=?";
        jdbcTemplate.update(sql,resultVO.getCompositionUID() , resultVO.getPatientUID(), "1", resultVO.getCompositionUID() != null,
                CommonUtils.gregorianToJalali(new Date()),new Date(),sepasId);
    }

}
