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
}
