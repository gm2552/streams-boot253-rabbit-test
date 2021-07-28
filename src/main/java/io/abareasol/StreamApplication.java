package io.abareasol;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class StreamApplication 
{
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(StreamApplication.class)
			.web(WebApplicationType.NONE).run(args);
	}
}
