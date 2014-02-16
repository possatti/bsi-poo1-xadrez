package br.edu.ifes.poo1.cln.cdp.ia;

import br.edu.ifes.poo1.cln.cdp.CasaOcupadaException;
import br.edu.ifes.poo1.cln.cdp.Jogada;
import br.edu.ifes.poo1.cln.cdp.Jogador;
import br.edu.ifes.poo1.cln.cdp.TabuleiroXadrez;
import br.edu.ifes.poo1.cln.cdp.TipoCorJogador;
import br.edu.ifes.poo1.cln.cdp.TipoJogador;

public abstract class Maquina extends Jogador {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Maquina(String nome, TipoCorJogador cor, TipoJogador tipoJogador) {
		super(nome, cor, tipoJogador);
	}

	/**
	 * Define qual será a jogada realizada pela máquina
	 * 
	 * @return
	 * @throws CasaOcupadaException 
	 */
	public abstract Jogada escolherJogada(TabuleiroXadrez tabuleiroAtual) throws CasaOcupadaException;

}
