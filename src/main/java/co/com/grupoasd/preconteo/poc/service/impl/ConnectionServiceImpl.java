package co.com.grupoasd.preconteo.poc.service.impl;

import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import co.com.grupoasd.preconteo.poc.service.ConnectionService;

@Service
public class ConnectionServiceImpl implements ConnectionService {

	@Override
	public boolean createBucketAws(String nameBucket) {
		
		var connection = connectionAws();
		
		String bucketName = "baeldung-bucket";

//		if (connection.doesBucketExist(bucketName)) {
//			LOG.info("Bucket name is not available." + " Try again with a different Bucket name.");
//			return;
//		}

		connection.createBucket(bucketName);
		
		return true;
	}
	
	private AmazonS3 connectionAws() {
		try {

			
			AWSCredentials credentials = new BasicAWSCredentials("AKIATEY56CFXZTDYYCHI", "wbLwsUJV7gzcB2IRga6k/IllfxG1zIHvjxlO9wK1");
			
			AmazonS3 s3Client = AmazonS3ClientBuilder
					  .standard()
					  .withCredentials(new AWSStaticCredentialsProvider(credentials))
					  .withRegion(Regions.US_EAST_2)
					  .build();
			
			
			s3Client.createBucket("kjkjkljk");
			return null;
			
		}catch(AmazonServiceException e) {
			
			return null;
			
		}
		
		
		
		
	}

}
