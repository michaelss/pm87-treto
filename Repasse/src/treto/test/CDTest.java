package treto.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import treto.model.CD;
import treto.model.Musica;

public class CDTest {
	
	@Test
	public void deveriaConterZeroMusicas() {
		CD cd = new CD();
		assertEquals(0, cd.quantidadeDeMusicas());
	}
	
	@Test
	public void deveriaConterUmaMusica() {
		CD cd = new CD();
		Musica musica = new Musica("Lepo Lepo - isso é musica?");
		cd.addMusica(musica);
		assertEquals(1, cd.quantidadeDeMusicas());
	}
	
	@Test
	public void deveriaRetornarAQuantidadeDeMusicas() {
		CD cd = new CD();
		Musica musica = new Musica("Lepo Lepo");
		Musica musicaForro = new Musica("Dança do Desengonçado");
		List<Musica> musicas = new ArrayList<Musica>();
		musicas.add(musica);
		musicas.add(musicaForro);
		
		cd.addMusicas(musicas);
		assertEquals(2, cd.quantidadeDeMusicas());
	}

}
