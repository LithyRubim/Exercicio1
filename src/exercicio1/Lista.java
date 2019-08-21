
package exercicio1;


public class Lista {
    String[] dados = null;
	int i = -1;
	
	//Sub rotinas de Lista
	
	/**
	 * @return retorna se o array dados está ou não declarado
	 */
	boolean isEmpty() {
		if ( dados == null ) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Faz com que a String str passada por parametro seja colocada
	 * no array dados, caso o array tenha alcançado o seu tamanho
	 * máximo então faz uma copia e levas os valores para copia
	 * por fim essa cópia será referenciada pelo array dados
	 * @param str
	 */
	void add(String str) {
		//controlar duplicidades
		if ( contains(str) ) {
			System.out.println(str + " aluno já foi adicionado");
			return;
		}
		
		if ( isEmpty() ) {
			dados = new String[10];
		}
		
		i++;
		
		if ( dados.length <= i ) {
			String[] copia = new String[dados.length + 10];
			for (int j = 0; j < dados.length; j++) {
				copia[j] = dados[j];
			}
			dados = copia;
		}
		
		dados[i] = str;
	}
	
	/**
	 * @return o número de alunos adicionados
	 */
	int size() {
		return i;
	}
	
	/**
	 * Faz com que sejam listados todas as alunos adicionadas 
	 */
	void list() {
		for (int j = 0; j <= i ; j++) {
			System.out.println( dados[j] );
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return verifica se uma String str foi já adicionada
	 */
	boolean contains(String str) {
		boolean has = false;
		
		for (int j = 0; j <= i; j++) {
			if ( str.equals( dados[j] ) ) {
				has = true;
				break;
			}
		}
		
		return has;
	}
	
	/**
	 * @return retorna a ultima String adicionada removendo ela da
	 * lista
	 */
	String remove() {
		String removida = null;
		
		if ( ! isEmpty() ) {
			removida = dados[i];
			dados[i] = null;
			
			if ( i == 0 ) {
				dados = null;
			}
			
			i--;
		}
		
		return removida;
	}
	
	/**
	 * @param pos
	 * @param valor
	 * Altera o valor da posição pos pelo valor passado por parametro
	 * Se essa posição existir
	 */
	void set(int pos, String valor) {
		
		if ( ! isEmpty() ) {
			
			if ( pos > -1 && pos <= i ) {
				dados[pos] = valor;
			} else {
				System.out.println("Está posição nao existe");
			}
			
		} else {
			System.out.println("Lista vazia");
		}
	}
	

	String get(int pos) {
		String r = null;
		
		if ( ! isEmpty() ) {
			if ( pos >= 0 && pos <= i) {
				r = dados[pos];
			}
		}
		
		return r;
	}
	
	int indexOf(String str) {
		
		for (int j = 0; j <= i ; j++) {
			if ( dados[j].equals( str ) ) {
				return j;
			}
		}
		
		return -1;
	}
}


