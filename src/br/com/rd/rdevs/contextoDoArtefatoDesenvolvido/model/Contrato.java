package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.model;

import java.sql.Date;

public abstract class Contrato implements AssinarContrato {
	private int numeroRegistro;
	private String nomeTitular;
	private String nomeTestemunha;
	private String objetoContrato;
	private Date dataEmissao;
	private Date dataRegistro;
	private String nomeTabeliao;
	private String nomeCartorio;
	private int qtdeCertidao = 1;
	private int identificador;
	
	
	
	public Contrato(int numeroRegistro, String nomeTitular, String nomeTestemunha, String objetoContrato,
			Date dataEmissao, Date dataRegistro, String nomeTabeliao, String nomeCartorio) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nomeTitular = nomeTitular;
		this.nomeTestemunha = nomeTestemunha;
		this.objetoContrato = objetoContrato;
		this.dataEmissao = dataEmissao;
		this.dataRegistro = dataRegistro;
		this.nomeTabeliao = nomeTabeliao;
		this.nomeCartorio = nomeCartorio;
	}
	
	public Contrato() {
		
	}
 	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNomeTestemunha() {
		return nomeTestemunha;
	}
	public void setNomeTestemunha(String nomeTestemunha) {
		this.nomeTestemunha = nomeTestemunha;
	}
	public String getObjetoContrato() {
		return objetoContrato;
	}
	public void setObjetoContrato(String objetoContrato) {
		this.objetoContrato = objetoContrato;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
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

	public void assinar() {
		// TODO Auto-generated method stub
		
	}
	
	public int getIdentificador() {
		return identificador = identificador + qtdeCertidao;
	}
	
	
}
