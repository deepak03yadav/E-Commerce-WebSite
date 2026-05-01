package com.stylecart.utils;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class CommonUtils {

	public Boolean sendEmail(String url, String reciepentEmail) throws UnsupportedEncodingException, MessagingException {
		// Email feature disabled for local setup
		System.out.println("Email feature disabled. Password reset link: " + url);
		return true;
	}

	public static String generateUrl(HttpServletRequest request) {
		String fullUrl = request.getRequestURL().toString();
		return fullUrl.replace(request.getServletPath(), "");
	}
}