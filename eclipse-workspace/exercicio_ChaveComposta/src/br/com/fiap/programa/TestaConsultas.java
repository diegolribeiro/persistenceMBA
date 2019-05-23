package br.com.fiap.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;
import br.com.fiap.entity.PedidosPK;

public class TestaConsultas {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaVendas");
		EntityManager em = emf.createEntityManager();
		Cliente cliente = em.find(Cliente.class, 10);
		System.out.println(cliente.getEmpresa());
		
		PedidosPK pk = new PedidosPK();
		pk.setCategoria("Livros");
		pk.setCodigo(100);
		
		Pedido pedido = em.find(Pedido.class, pk);
		System.out.println(pedido.getPedidoPK().getCategoria());
	}
}
