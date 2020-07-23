package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.model;

import java.sql.Date;

public class Trabalho extends Contrato {

	public Trabalho(int numeroRegistro, String nomeTitular, String nomeTestemunha, String objetoContrato,
			Date dataEmissao, Date dataRegistro, String nomeTabeliao, String nomeCartorio) {
		super(numeroRegistro, nomeTitular, nomeTestemunha, objetoContrato, dataEmissao, dataRegistro, nomeTabeliao,
				nomeCartorio);
	}

	public Trabalho () {
		
	}

	public int getNumeroRegistro() {
		return this.getNumeroRegistro();
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.setNumeroRegistro(numeroRegistro);;
	}
	public String getNomeTitular() {
		return this.getNomeTitular();
	}
	public void setNomeTitular(String nomeTitular) {
		this.setNomeTitular(nomeTitular);
	}
	public String getNomeTestemunha() {
		return this.getNomeTestemunha();
	}
	public void setNomeTestemunha(String nomeTestemunha) {
		this.setNomeTestemunha(nomeTestemunha);;
	}
	public String getObjetoContrato() {
		return this.getObjetoContrato();
	}
	public void setObjetoContrato(String objetoContrato) {
		this.setObjetoContrato(objetoContrato);;
	}
	public Date getDataEmissao() {
		return this.getDataEmissao();
	}
	public void setDataEmissao(Date dataEmissao) {
		this.setDataEmissao(dataEmissao);
	}
	public Date getDataRegistro() {
		return this.getDataRegistro();
	}
	public void setDataRegistro(Date dataRegistro) {
		this.setDataRegistro(dataRegistro);
	}
	public String getNomeTabeliao() {
		return this.getNomeTabeliao();
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.setNomeTabeliao(nomeTabeliao);;
	}
	public String getNomeCartorio() {
		return this.getNomeCartorio();
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.setNomeCartorio(nomeCartorio);
	}

	public void assinar() {
		// TODO Auto-generated method stub
		
	}
	
	public int getIdentificador() {
		return this.getIdentificador();
	}
	
}
