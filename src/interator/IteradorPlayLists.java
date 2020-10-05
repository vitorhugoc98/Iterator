package interator;

import java.util.ArrayList;

public class IteradorPlayLists {
    ArrayList<PlayList> lista;
	int contador;

	protected IteradorPlayLists(ArrayList<PlayList> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximaPlayList() {
		contador++;
	}

	public void voltarPlayList() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	private PlayList currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getNomePlayList() {
		return currentItem().nome;
	}
}
