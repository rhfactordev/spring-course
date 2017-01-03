package br.com.rhfactor.shop.daos;

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
}