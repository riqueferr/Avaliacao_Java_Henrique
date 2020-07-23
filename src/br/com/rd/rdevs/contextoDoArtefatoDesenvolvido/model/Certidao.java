package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.model;

import java.sql.Date;

public abstract class Certidao extends RuntimeException{
	private int registroCertidao;
	private String nomeTitular;
	private String nomeDeclarante;
	private String tipoCertidao;
	private Date dataEmissao;
	private String nomeTabeliao;
	private String nomeCartorio;
	private int qtdeCertidao = 1;
	private int identificador;
	
	
	


	public Certidao(int registroCertidao, String nomeTitular, String nomeDeclarante, String tipoCertidao,
			Date dataEmissao, String nomeTabeliao, String nomeCartorio) {
		super();
		this.registroCertidao = registroCertidao;
		this.nomeTitular = nomeTitular;
		this.nomeDeclarante = nomeDeclarante;
		this.tipoCertidao = tipoCertidao;
		this.dataEmissao = dataEmissao;
		this.nomeTabeliao = nomeTabeliao;
		this.nomeCartorio = nomeCartorio;
		
	}
	
	public Certidao() {
		
	}
	
	boolean qtdeLimiteCertidao(int identificador) {
		if (this.identificador >= 9999) {
		throw new IllegalArgumentException("Excesso de cadastros."); 
		} 	
		return true;
	}
	
	public int getRegistroCertidao() {
		return registroCertidao;
	}
	public void setRegistroCertidao(int registroCertidao) {
		this.registroCertidao = registroCertidao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNomeDeclarante() {
		return nomeDeclarante;
	}
	public void setNomeDeclarante(String nomeDeclarante) {
		this.nomeDeclarante = nomeDeclarante;
	}
	public String getTipoCertidao() {
		return tipoCertidao;
	}
	public void setTipoCertidao(String tipoCertidao) {
		this.tipoCertidao = tipoCertidao;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
	}
	public String getNomeCartorio() {
		return nomeCartorio;
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}
	
	public int getQtdeCertidao() {
		return qtdeCertidao;
	}

	public void setQtdeCertidao(int qtdeCertidao) {
		this.qtdeCertidao = qtdeCertidao;
	}

	public int getIdentificador() {
		return identificador = identificador + qtdeCertidao;
	}

}
