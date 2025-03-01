package com.demo.SpringConcepts;

import com.demo.SpringConcepts.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	// Initialize SLF4J Logger
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("🚀 Starting Spring Concepts Application...");

		// Start Application and get ApplicationContext
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);

		logger.info("✅ ApplicationContext Loaded Successfully!");

		// Get and use DemoBean
		DemoBean demoBean = context.getBean(DemoBean.class);
		demoBean.displayMessage();

		logger.debug("🔍 Checking Context: {}", demoBean);
		logger.info("\n🎯 ** Example Using @Autowired annotation on property **");
	}
}
