package com.avula.spring.events.handler;

import com.avula.spring.events.dto.DisChargePatientRequest;
import com.avula.spring.events.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingServiceHandler {
@Async
    @EventListener
    public void cleanRoom(PatientDischargeEvent event) throws InterruptedException {
    Thread.sleep(20000);
        System.out.println("Room Cleaned {}" + event.getPatientName()+"Thread Name "+Thread.currentThread().getName());
    }
}
