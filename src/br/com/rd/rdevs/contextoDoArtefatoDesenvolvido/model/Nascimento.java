package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.model;

import java.sql.Date;

public class Nascimento extends Certidao {

	public Nascimento(int registroCertidao, String nomeTitular, String nomeDeclarante, String tipoCertidao,
			Date dataEmissao, String nomeTabeliao, String nomeCartorio) {
		super(registroCertidao, nomeTitular, nomeDeclarante, tipoCertidao, dataEmissao, nomeTabeliao, nomeCartorio);
	}

	public int getRegistroCertidao() {
		return this.getIdentificador();
	}

	public String getNomeTitular() {
		return this.getNomeTitular();
	}

	public String setNomeTitular() {
		return this.setNomeTitular() ;
	}
	public String getNomeDeclarante() {
		return this.getNomeDeclarante();
	}
	public String setNomeDeclarante() {
		return this.setNomeDeclarante();
	}
	public String getTipoCertidao() {
		return this.setNomeDeclarante();
	}
	public void setTipoCertidao() {
		this.setTipoCertidao();
	}
	public Date getDataEmissao() {
		return this.getDataEmissao();
	}
	public void setDataEmissao(Date dataEmissao) {
		this.setDataEmissao(dataEmissao);;
	}
	public String getNomeTabeliao() {
		return this.getNomeTabeliao();
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.setNomeTabeliao(nomeTabeliao);
	}
	public String getNomeCartorio() {
		return this.getNomeCartorio();
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.setNomeCartorio(nomeCartorio);;
	}
	
	public int getQtdeCertidao() {
		return this.getQtdeCertidao();
	}

	public void setQtdeCertidao() {
		this.setQtdeCertidao();;
	}

	public int getIdentificador() {
		return this.getIdentificador() ;
	}
}
