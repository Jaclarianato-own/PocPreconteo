package co.com.grupoasd.preconteo.poc.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import co.com.grupoasd.preconteo.poc.service.ConnectionService;

@Component
public class PocJob {
	
	@Autowired
	ConnectionService conn;
	
	@Scheduled(fixedRate = 1000)
	public void updateBucketAws() {
		conn.createBucketAws("Mi primer bucket");
	}
	

}
