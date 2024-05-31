package com.avula.spring.events.handler;

import com.avula.spring.events.dto.DisChargePatientRequest;
import com.avula.spring.events.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceHandler {
@Async
    @EventListener
    public void sendNotification(PatientDischargeEvent   event){
        System.out.println("Notification sent for the patient {}"+ event.getPatientName()+"Thread Name "+Thread.currentThread().getName());
    }
}
