package com.avula.spring.events.handler;


import com.avula.spring.events.dto.DisChargePatientRequest;
import com.avula.spring.events.event.PatientDischargeEvent;
import jakarta.websocket.RemoteEndpoint;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

@Async
    @EventListener
    public void generateBill(PatientDischargeEvent event) {
        System.out.println("Bill Generated for the patient {}" + event.getPatientName()+"Thread Name "+Thread.currentThread().getName());
    }
}
