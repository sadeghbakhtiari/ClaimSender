package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdmissionVoMapper implements RowMapper<AdmissionVo> {

    @Override
    public AdmissionVo mapRow(ResultSet row, int rowNum) throws SQLException {
        AdmissionVo admissionVo = new AdmissionVo();
        admissionVo.setAdmissionDay(CommonUtils.handleNull(row.getString("AdmissionDay")));
        admissionVo.setAdmissionHour(CommonUtils.handleNull(row.getString("AdmissionHour")));
        admissionVo.setAdmissionMinute(CommonUtils.handleNull(row.getString("AdmissionMinute")));
        admissionVo.setAdmissionMonth(CommonUtils.handleNull(row.getString("AdmissionMonth")));
        admissionVo.setAdmissionSecond(CommonUtils.handleNull(row.getString("AdmissionSecond")));
        admissionVo.setAdmissionTypeCode(row.getString("AdmissionTypeCode"));
        admissionVo.setAdmissionYear(CommonUtils.handleNull(row.getString("AdmissionYear")));
        admissionVo.setAdmittingDoctorId(CommonUtils.handleNull(row.getString("AdmittingDoctor_HealthcareProviderFK")));
        admissionVo.setAttendingDoctorId(CommonUtils.handleNull(row.getString("AttendingDoctor_HealthcareProviderFK")));
        admissionVo.setEmsId(row.getString("EMSID"));
        admissionVo.setMedicalRecordNumber(row.getString("MedicalRecordNumber"));
        admissionVo.setReasonForEncounterCode(row.getString("ReasonForEncounterCode"));
        admissionVo.setReferringDoctorId(CommonUtils.handleNull(row.getString("ReferringDoctor_HealthcareProviderFK")));
        admissionVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return admissionVo;
    }

}
