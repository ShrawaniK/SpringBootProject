package com.ibm.sts.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.sts.emailer.iEmailerService;
@RestController
public class EmailServiceController {
	//iEmailService emailService = new  DummyEmailSender();
		//Dont create any object with specific type
		//two primary bean cant be allowed
		//@Autowired at instance variable
		iEmailerService emailservice;
		
	// http://localhost:8080/sendemail
		@RequestMapping("/sendemail")
		public String email() throws MessagingException{
			//call sendEMail method
			emailservice.sendEmail("stevejobs@apple.com", "Launching of new Apple Model", "Body of the email");
			
			return "Email Sent";
		}
		@RequestMapping("/draftemail")
		public String emailDraft()
		{
			return "Draft";
		}
	@Autowired
		public void iEmailServiceController(iEmailerService abc) {
			this.emailservice=abc;
		}

		public iEmailerService getEmailservice() { //at getter method
			return emailservice;
		}
		/*@Autowired //at setter method
		public void setEmailservice(iEmailerService smtpBean) {
			this.emailservice = smtpBean;
		}*/
}