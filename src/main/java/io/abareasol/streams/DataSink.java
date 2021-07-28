package io.abareasol.streams;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSink 
{
	@Bean
	public Consumer<String> dataConsumer()
	{
		return System.out::println;
	}
}
