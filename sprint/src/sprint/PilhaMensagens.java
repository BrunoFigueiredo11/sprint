package sprint;

public class PilhaMensagens {
	public final int N = 5;
	Usuario pilha[] = new Usuario[N];
	int topo;

	// inicializa os indices **contadores**
	public void init() {
		topo = 0;
	}

	// verifica se a pilha 1 esta vazia
	public boolean isEmptyPilha1() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	// verifica se a pilha 1 esta cheia
	public boolean isFullPilha1() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(Usuario mensagem) {
		if (isFullPilha1() == false) {
			pilha[topo] = mensagem;
			topo++;
		} else
			System.out.println("Pilha 1 Limite Máximo");
	}

	public void leMsg() {
		for (int i = topo - 1; i >= 0; i--) {
			if (pilha[i].getStatus() == "não ok") {
				pilha[i].setStatus("ok");
				pilha[i].setFeedBack("Problema resolvido.");
				System.out.println(pilha[i]);
			} else {
			}
		}
		topo = 0;
	}
}
