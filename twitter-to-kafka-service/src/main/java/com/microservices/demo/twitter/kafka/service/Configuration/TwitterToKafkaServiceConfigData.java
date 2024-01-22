package com.microservices.demo.twitter.kafka.service.Configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Data
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
@Configuration
public class TwitterToKafkaServiceConfigData {
    private List<String> twitterKeywords;
}
