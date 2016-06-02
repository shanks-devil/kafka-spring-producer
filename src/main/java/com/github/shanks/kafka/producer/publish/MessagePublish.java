package com.github.shanks.kafka.producer.publish;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.shanks.kafka.producer.PublishMsg;

import lombok.Getter;
import lombok.experimental.Accessors;

@Service
public class MessagePublish extends PublishMsg {

	@Value("${helloworld.topic}")
	@Getter
	@Accessors(fluent = true)
	private String publishTopic;
	
}
