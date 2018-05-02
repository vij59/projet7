package org.batch;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailMail
{
	private JavaMailSender mailSender;
	private SimpleMailMessage simpleMailMessage;
	
	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String to, String nom, String content) {
	
	   MimeMessage message = mailSender.createMimeMessage();
		
	   try{
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
			
		helper.setFrom(simpleMailMessage.getFrom());
		helper.setTo(to);
		helper.setSubject(simpleMailMessage.getSubject());
		helper.setText(String.format(
			simpleMailMessage.getText(), nom, content));
	

	     }catch (MessagingException e) {
		throw new MailParseException(e);
	     }
	     mailSender.send(message);
         }
}
