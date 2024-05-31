package com.avula.spring.events.handler;

import com.avula.spring.events.dto.DisChargePatientRequest;
import com.avula.spring.events.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class RecordServiceHandler {

    @Async
    @EventListener
    public void recordPatientDischarge(PatientDischargeEvent event) {
        System.out.println("Patient Discharged {}" + event.getPatientName()+"Thread Name "+Thread.currentThread().getName());
    }
}
