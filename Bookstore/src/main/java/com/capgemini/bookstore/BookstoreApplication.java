package com.capgemini.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.bookstore.dao.CustomerDao;
import com.capgemini.bookstore.entity.Customer;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(BookstoreApplication.class);
	
	@Autowired
	private CustomerDao customerDao;

	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warning message");
		logger.error("this is a error message");
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer cus = new Customer(10, "rajat", "rjt@gmail.com", "123456", "5414647", "jvgghcghfh", "bangalore", "244412", "India");
		customerDao.save(cus);
		//TODO Auto-generated method stub
		logger.info("Data inserted successfully");
		
	}

}
