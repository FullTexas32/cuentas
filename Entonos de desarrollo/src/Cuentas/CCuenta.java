public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterÃ©s;
    public getnombre() {return nombre;}
	public getcuenta() {return cuenta;}
	public getsaldo() {return saldo; }


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo, float cantidad)
    {
    	public getnombre() {nombre=nom;}
    	public getcuenta() {cuenta=cue;}
    	public getsaldo() {saldo=sal; }
    	float cantidad;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    public operativa_cuenta {
    	
            CCuenta cuenta1;
            double saldoActual;

            cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
            saldoActual = cuenta1.estado();
            System.out.println("El saldo actual es"+ saldoActual );

            try {
                cuenta1.retirar(2300);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }   
}
