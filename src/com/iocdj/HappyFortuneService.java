package com.iocdj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortuneService() {
		
		return "Get Happy Fortune";
	}

}
