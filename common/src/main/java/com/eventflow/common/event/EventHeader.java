package com.eventflow.common.event;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventHeader {
    private String eventId;
    private String eventType;
    private String version;
    private long timestamp;
    private String source;
}