package treto.model;

import java.util.ArrayList;
import java.util.List;

public class CD {

	private List<Musica> musicas = new ArrayList<Musica>();

	public int quantidadeDeMusicas() {
		return musicas.size();
	}

	public void addMusica(Musica musica) {
		this.musicas.add(musica);
	}

	public void addMusicas(List<Musica> musicas) {
		this.musicas.addAll(musicas);		
	}

}
