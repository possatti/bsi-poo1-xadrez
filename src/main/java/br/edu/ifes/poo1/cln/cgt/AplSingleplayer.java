package br.edu.ifes.poo1.cln.cgt;

import br.edu.ifes.poo1.cln.cdp.CorJogador;
import br.edu.ifes.poo1.cln.cdp.Jogada;
import br.edu.ifes.poo1.cln.cdp.JogadaInvalidaException;
import br.edu.ifes.poo1.cln.cdp.Maquina;
import br.edu.ifes.poo1.cln.cdp.Pessoa;

public class AplSingleplayer extends AplJogo {

	/**
	 * Inicia uma nova partida singleplayer.
	 * 
	 * @param nomeJogador
	 *            Nome do jogador humano.
	 */
	public AplSingleplayer(String nomeJogador, String nomeMaquina) {
		super(new Pessoa(nomeJogador, CorJogador.BRANCO), new Maquina(nomeMaquina,
				CorJogador.PRETO));
	}

	@Override
	public void executarjogada(Jogada jogada) throws JogadaInvalidaException {
		// Solicita o humano que faça a jogada proposta.
		brancas.executarJogada(jogada);

		// TODO: Fazer verificação do Xeque e o Xeque Mate.
		
		// Troca o turno.
		super.trocarTurno();
		
		// Pede a jogada da máquina.
		Jogada jogadaMaquina;
		
		// Executa a jogada da máquina.
		pretas.executarJogada(jogadaMaquina);
		
		// TODO: Fazer verificação do Xeque e o Xeque Mate.
		
		// Troca novamente o turno.
		super.trocarTurno();
	}

}
