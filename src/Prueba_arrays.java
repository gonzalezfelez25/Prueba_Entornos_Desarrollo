
public class Prueba_arrays {

	public static void main(String[] args) {
		
		//int numero = 10;
		int n[] = {8, 33, 200, 150, 11};
		//int m[] = new int [5];
		String palabras[] = {"HOLA", "ESTO", "ES", "TEXTO", "ARRAYS"};
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("PASO DE VALORES POR VALOR " + n[i]);
			System.out.println("PASO DE VALORES POR VALOR --" + palabras[i]);
		}
	}

}
