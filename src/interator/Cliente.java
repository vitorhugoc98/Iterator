package interator;
public class Cliente {

    public static void main(String[] args) {
        PlayListsPop minhasPlayLists = new PlayListsPop();
		System.out.println("Iterando com for:");
		for (IteradorPlayLists it = minhasPlayLists.criarIterator(); !it.isDone(); it
				.proximaPlayList()) {
			System.out.println(it.getNomePlayList());
		}

		System.out.println("\nIterando manualmente:");
		IteradorPlayLists it = minhasPlayLists.criarIterator();
		System.out.println(it.getNomePlayList());
		it.proximaPlayList();
		System.out.println(it.getNomePlayList());
		it.proximaPlayList();
		System.out.println(it.getNomePlayList());
		it.proximaPlayList();
		System.out.println(it.getNomePlayList());
		it.proximaPlayList();
		System.out.println(it.getNomePlayList());

		System.out.println("\nIterando fora dos limites:");
		it.proximaPlayList();
		System.out.println(it.getNomePlayList());
		it.first();
		it.voltarPlayList();
		System.out.println(it.getNomePlayList());
    }
    
}
