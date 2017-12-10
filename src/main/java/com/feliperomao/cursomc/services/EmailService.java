package com.feliperomao.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.feliperomao.cursomc.domain.Cliente;
import com.feliperomao.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
