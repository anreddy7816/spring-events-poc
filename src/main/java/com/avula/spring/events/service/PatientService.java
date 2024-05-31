package com.avula.spring.events.service;

import com.avula.spring.events.dto.DisChargePatientRequest;
import com.avula.spring.events.event.PatientDischargeEvent;
import com.avula.spring.events.handler.BillingServiceHandler;
import com.avula.spring.events.handler.HouseKeepingServiceHandler;
import com.avula.spring.events.handler.NotificationServiceHandler;
import com.avula.spring.events.handler.RecordServiceHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private ApplicationEventPublisher publisher;

//    @Autowired
//    private NotificationServiceHandler notificationService;
//
//    @Autowired
//    private HouseKeepingServiceHandler houseKeepingService;
//    @Autowired
//    private RecordServiceHandler recordService;
//    @Autowired
//    private BillingServiceHandler patientService;

    Logger log = LoggerFactory.getLogger(PatientService.class);

    public String disChargePatient(DisChargePatientRequest request) {
        log.info("Patient discharge initiated for patientId: {}", request.getPatientId());

//        patientService.generateBill(request);
//        notificationService.sendNotification(request);
//        houseKeepingService.cleanRoom(request);
//        recordService.recordPatientDischarge(request);

        publisher.publishEvent(new PatientDischargeEvent(this, request.getPatientName(), request.getPatientId()));

        log.info("Patient discharge completed for patientId: {}", request.getPatientId());

        return "Patient Discharged";
    }
}
