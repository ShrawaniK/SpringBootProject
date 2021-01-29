package com.ibm.sts.emailer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
/*This class will be use to configure the beans of Dummy
 * EmailSender.java and SmtpEmailSender.java as we may dont
 * have source of these class but we want to use them as a 
 * spring bean.
 */

@Configuration
public class MailConfig {
	@Bean
	@Profile("dev")
	public iEmailerService dummyEmailSender()
	{
		return new DummyEmailSender();
	}
	@Bean
	@Profile("prod")
	public iEmailerService smtpEmailSender(JavaMailSender javaMailSender)
	{
		return new SmtpEmailSender(javaMailSender);
	}
}
