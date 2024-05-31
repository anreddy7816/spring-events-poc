package com.avula.spring.events.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
@Getter
@Setter
public class PatientDischargeEvent extends ApplicationEvent {

    private String patientId;
    private String patientName;

    public PatientDischargeEvent(Object source, String patientId, String patientName) {
        super(source);
        this.patientName = patientName;
        this.patientId = patientId;
    }
}

