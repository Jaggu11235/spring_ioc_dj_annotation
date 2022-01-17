package com.iocdj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.properties")
public class SportConfig {

	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
			@Value("${printed.logger.level}") String printedLoggerLevel) {

		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);

		return myLoggerConfig;
	}

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for Happy fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach cricketCoach() {
		CricketCoach mySwimCoach = new CricketCoach(sadFortuneService());

		return mySwimCoach;
	}
	
	@Bean
	public Coach tennisCoach()
	{
		TennisCoach tennisCoach = new TennisCoach(happyFortuneService());
		return tennisCoach;
	}

}
