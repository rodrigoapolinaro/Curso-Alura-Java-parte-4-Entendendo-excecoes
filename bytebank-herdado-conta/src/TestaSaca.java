
public class TestaSaca {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.00);
		try {
			c.saca(200.00);
		} catch (SaldoInsuficenteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(c.getSaldo());
	}

}
