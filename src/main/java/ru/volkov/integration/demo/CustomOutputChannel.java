package ru.volkov.integration.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;

@Configuration
public class CustomOutputChannel {

    @Bean
    public DirectChannel outputChannel() {
        return new DirectChannel();
    }
}
