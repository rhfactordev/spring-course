package br.com.rhfactor.shop.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.rhfactor.shop.beans.Produto;

@Repository
@Transactional
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager em;

	public void salvar(Produto produto) {
		this.em.persist(produto);
	}

	public List<Produto> listar() {
		return this.em.createQuery("SELECT p FROM Produto ORDER BY p.nome",Produto.class)
				.getResultList();
	}
}