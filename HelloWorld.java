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

	static String dividir(double n1, double n2){
		double res;
	if(n2 != 0){
	  	 res = (n1 / n2);
         	    	 return "El resultado es: " + res;
	           }else{
        		return "No se puede dividir por 0";
	          }
  	}
}
