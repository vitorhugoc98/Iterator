package interator;

import java.util.ArrayList;

//Na classe Agragado é onde definimos a nossa lista, fazemos a contagem da lista 
// e chamamos o Interator passando a lista 

public abstract class  AgregadoDePlayLists {
    	protected ArrayList<PlayList> playLists;

	public AgregadoDePlayLists() {
		playLists = new ArrayList<PlayList>();
	}

	public int count() {
		return playLists.size();
	}

	public IteradorPlayLists criarIterator() {
		return new IteradorPlayLists(playLists);
	}
}
