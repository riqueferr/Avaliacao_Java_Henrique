package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.model;

import java.sql.Date;

public class CompraVenda extends Contrato {

	public CompraVenda(int numeroRegistro, String nomeTitular, String nomeTestemunha, String objetoContrato,
			Date dataEmissao, Date dataRegistro, String nomeTabeliao, String nomeCartorio) {
		super(numeroRegistro, nomeTitular, nomeTestemunha, objetoContrato, dataEmissao, dataRegistro, nomeTabeliao,
				nomeCartorio);
	}

	public CompraVenda() {
		
	}

	@Override
	public void assinar() {
		
	}
}
