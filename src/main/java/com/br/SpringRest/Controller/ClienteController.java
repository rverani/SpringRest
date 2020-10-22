package com.br.SpringRest.Controller;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.br.SpringRest.Domain.Model.*;

@RestController
public class ClienteController {
	
	private final AtomicLong counter = new AtomicLong();
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/clientes")
	public List<Cliente> Listar(@RequestParam(required = false, defaultValue = "")String name) {
			
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setBanco("Bradesco");
		cliente1.setTipo("RET");
		cliente1.setArquivo("CB120800.RET");
		cliente1.setDt_geracao("12/08/2020");
		cliente1.setGer_por("RRCUNHA");
		cliente1.setDt_envio("12/08/2020");
		cliente1.setQtd_linhas(508);
		cliente1.setCarteira(19);
		cliente1.setVl_total("110.266,19");
		cliente1.setTxt("Download");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setBanco("Bradesco");
		cliente2.setTipo("RET");
		cliente2.setArquivo("CB120801.RET");
		cliente2.setDt_geracao("12/08/2020");
		cliente2.setGer_por("RRCUNHA");
		cliente2.setDt_envio("12/08/2020");
		cliente2.setQtd_linhas(320);
		cliente2.setCarteira(9L);
		cliente2.setVl_total("100.598,46");
		cliente2.setTxt("Download");
		

		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setBanco("Bradesco");
		cliente3.setTipo("RET");
		cliente3.setArquivo("CB120802.RET");
		cliente3.setDt_geracao("12/08/2020");
		cliente3.setGer_por("RRCUNHA");
		cliente3.setDt_envio("12/08/2020");
		cliente3.setQtd_linhas(8L);
		cliente3.setCarteira(6L);
		cliente3.setVl_total("34.975,77");
		cliente3.setTxt("Download");

		var cliente4 = new Cliente();
		cliente4.setId(4L);
		cliente4.setBanco("Bradesco");
		cliente4.setTipo("RET");
		cliente4.setArquivo("CB120803.RET");
		cliente4.setDt_geracao("12/08/2020");
		cliente4.setGer_por("RRCUNHA");
		cliente4.setDt_envio("12/08/2020");
		cliente4.setQtd_linhas(603);
		cliente4.setCarteira(26L);
		cliente4.setVl_total("139.881,24");
		cliente4.setTxt("Download");


		var cliente5 = new Cliente();
		cliente5.setId(5L);
		cliente5.setBanco("Bradesco");
		cliente5.setTipo("REM");
		cliente5.setArquivo("CB120801.REM");
		cliente5.setDt_geracao("12/08/2020");
		cliente5.setGer_por("MMORAIS");
		cliente5.setDt_envio("12/08/2020");
		cliente5.setQtd_linhas(286);
		cliente5.setCarteira(9L);
		cliente5.setVl_total("208.924,55");
		cliente5.setTxt("Download");

		var cliente6 = new Cliente();
		cliente6.setId(6L);
		cliente6.setBanco("Bradesco");
		cliente6.setTipo("REM");
		cliente6.setArquivo("CB120802.REM");
		cliente6.setDt_geracao("12/08/2020");
		cliente6.setGer_por("MMORAIS");
		cliente6.setDt_envio("12/08/2020");
		cliente6.setQtd_linhas(15);
		cliente6.setCarteira(19);
		cliente6.setVl_total("6.260,43");
		cliente6.setTxt("Download");

		
		return Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5, cliente6);
	}
}
