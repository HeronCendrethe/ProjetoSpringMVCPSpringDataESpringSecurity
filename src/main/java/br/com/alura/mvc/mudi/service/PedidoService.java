package br.com.alura.mvc.mudi.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Repository
public class PedidoService {
	
	private final PedidoRepository pedidoRepository;

	public PedidoService(PedidoRepository pedidoRepository) {
		super();
		this.pedidoRepository = pedidoRepository;
	}
	
public List<Pedido> listaPedido () {
	List<Pedido> pedido = (List<Pedido>) pedidoRepository.findAll();
	return pedido;
	}

}
