package com.br.SpringRest.Domain.Model;

public class Cliente {
	
	private long id;
	private String banco;
	private String tipo;
	private String arquivo;
	private String dt_geracao;
	private String ger_por;
	private String dt_envio;
	private long qtd_linhas;
	private long carteira;
	private String vl_total;
	private String txt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String getDt_geracao() {
		return dt_geracao;
	}
	public void setDt_geracao(String dt_geracao) {
		this.dt_geracao = dt_geracao;
	}
	public String getGer_por() {
		return ger_por;
	}
	public void setGer_por(String ger_por) {
		this.ger_por = ger_por;
	}
	public String getDt_envio() {
		return dt_envio;
	}
	public void setDt_envio(String dt_envio) {
		this.dt_envio = dt_envio;
	}
	public long getQtd_linhas() {
		return qtd_linhas;
	}
	public void setQtd_linhas(long qtd_linhas) {
		this.qtd_linhas = qtd_linhas;
	}
	public long getCarteira() {
		return carteira;
	}
	public void setCarteira(long carteira) {
		this.carteira = carteira;
	}
	public String getVl_total() {
		return vl_total;
	}
	public void setVl_total(String vl_total) {
		this.vl_total = vl_total;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}

}
