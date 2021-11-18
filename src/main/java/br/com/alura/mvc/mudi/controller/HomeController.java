package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import br.com.alura.mvc.mudi.service.PedidoService;

@Controller
public class HomeController {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		PedidoService pedidoService = new PedidoService(pedidoRepository);
		List<Pedido> pedidos = pedidoService.listaPedido();
		System.out.println(pedidos);
		model.addAttribute("pedidos", pedidos);
		
		return "home"; 
	}
}
