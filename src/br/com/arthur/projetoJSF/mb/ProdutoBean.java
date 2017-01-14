package br.com.arthur.projetoJSF.mb;

import javax.faces.bean.ManagedBean;

import br.com.arthur.projetoJSF.dao.ProdutoDao;
import br.com.arthur.projetoJSF.modelo.Produto;

@ManagedBean
public class ProdutoBean {

	private	Produto	produto	=	new	Produto();
	
	public	Produto	getProduto() {
		return this.produto;
	}
	
	public void	grava() {
		ProdutoDao	dao	=	new	ProdutoDao();
		dao.adiciona(produto);
		this.produto	=	new	Produto();
	}
}
