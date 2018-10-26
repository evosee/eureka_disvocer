package com.example.demo.serviceb.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyMessageChannels {
    String INPUT = "my";
    @Input(INPUT)
    SubscribableChannel org();
}
