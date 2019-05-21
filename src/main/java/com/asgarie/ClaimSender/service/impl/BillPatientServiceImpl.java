package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.entity.ws.behdasht.sepas.BillPatient;
import com.asgarie.ClaimSender.entity.ws.behdasht.sepas.BillPatientService;
import com.asgarie.ClaimSender.entity.ws.behdasht.sepas.PatientBillMessageVO;
import com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm.ResultVO;
import com.asgarie.ClaimSender.service.api.AvaBillPatientService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.*;
import java.util.Iterator;

//VERY IMPORTANT.  SOME OF THESE EXIST IN MORE THAN ONE PACKAGE!

@Service
public class BillPatientServiceImpl implements AvaBillPatientService {

    public static final URL BILL_PATIENT_WS_URL = initBillPatientWSUrl();

    public ResultVO savePatientBillMessageVo(PatientBillMessageVO billPatientMessageVO) {
        URL url = BILL_PATIENT_WS_URL;
        BillPatientService billPatientService = new BillPatientService(url);
        BillPatient billPatient = billPatientService.getBillPatientPort();
        ResultVO resultVO = billPatient.savePatientBill(billPatientMessageVO);
        return resultVO;
    }

    private static URL initBillPatientWSUrl() {
        URL url = null;
        try {
            url = new URL(
                    "https://iehr.ihio.gov.ir:443/BillPatient/BillPatientPort?wsdl"
            );
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        return url;
    }
}
