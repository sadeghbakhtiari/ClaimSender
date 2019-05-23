package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.PersonInfoVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonInfoVoMapper implements RowMapper<PersonInfoVo> {

    @Override
    public PersonInfoVo mapRow(ResultSet row, int rowNum) throws SQLException {
        PersonInfoVo personInfoVo = new PersonInfoVo();
        personInfoVo.setFirstName(row.getString("FirstName"));
        personInfoVo.setLastName(row.getString("LastName"));
        personInfoVo.setFullName(row.getString("FullName"));
        personInfoVo.setMaritalStatusCode(row.getString("MaritalStatusCode"));
        personInfoVo.setNationalityCode(row.getString("NationalityCode"));
        personInfoVo.setBirthYear(CommonUtils.handleNull(row.getString("BirthYear")));
        personInfoVo.setBirthMonth(CommonUtils.handleNull(row.getString("BirthMonth")));
        personInfoVo.setBirthDay(CommonUtils.handleNull(row.getString("BirthDay")));
        personInfoVo.setBirthHour(CommonUtils.handleNull(row.getString("BirthHour")));
        personInfoVo.setBirthMinute(CommonUtils.handleNull(row.getString("BirthMinute")));
        personInfoVo.setBirthSecond(CommonUtils.handleNull(row.getString("BirthSecond")));
        personInfoVo.setBirthDateAccuracyCode(row.getString("BirthDateAccuracyCode"));
        personInfoVo.setFatherFirstName(row.getString("Father_FirstName"));
        personInfoVo.setFatherLastName(row.getString("Father_LastName"));
        personInfoVo.setMotherFirstName(row.getString("Mother_FirstName"));
        personInfoVo.setMotherLastName(row.getString("Mother_LastName"));
        personInfoVo.setFullAddress(row.getString("FullAddress"));
        personInfoVo.setIdCardNumber(row.getString("IDCardNumber"));
        personInfoVo.setNationalCode(row.getString("NationalCode"));
        personInfoVo.setPostalCode(row.getString("PostalCode"));
        personInfoVo.setGenderCode(row.getString("GenderCode"));
        personInfoVo.setHomeTel(row.getString("HomeTel"));
        personInfoVo.setMobileNumber(row.getString("MobileNumber"));
        personInfoVo.setEducationLevelCode(row.getString("EducationLevelCode"));
        personInfoVo.setJobCode(row.getString("JobCode"));
        personInfoVo.setJobDescription(row.getString("JobDescription"));
        personInfoVo.setLivingPlaceAreaHighLevelAreaVofk(CommonUtils.handleNull(row.getString("LivingPlaceArea_HighLevelAreaVOFK")));
        personInfoVo.setBirthPlaceAreaHighLevelAreaVofk(CommonUtils.handleNull(row.getString("BirthPlaceArea_HighLevelAreaVOFK")));
        personInfoVo.setIdIssuePlaceAreaHighLevelAreaVofk(CommonUtils.handleNull(row.getString("IDIssuePlaceArea_HighLevelAreaVOFK")));
        personInfoVo.setReligionCode(row.getString("ReligionCode"));
        personInfoVo.setOtherIdentifiersFk(CommonUtils.handleNull(row.getString("OtherIdentifiersFK")));
        personInfoVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return personInfoVo;
    }

}
