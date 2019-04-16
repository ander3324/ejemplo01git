class HelloWorld {

	public static void main (String[] args) {
		limpiar();
		System.out.println("Hello World!!!");
		System.out.println("Goodbye!!!");
	}

	static void limpiar() {
		try {
			new ProcessBuilder("clear").inheritIO().start();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	static double dividir(double n1, double n2){
	      double res;
		if(n2 != 0){
			res = (n1 / n2);
		}else{
		             errorDivision();
		}
	     return res;
	}

	static String errorDivision(){
	    return "No se puede dividir por 0";
	}
}
