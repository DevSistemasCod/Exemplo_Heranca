package entidade;

public class MountainBike extends Bicicleta {
	private float alturadoAssento;
	
	public MountainBike(int nroDeMarchas, int velocidade, float alturadoAssento) {
		super(nroDeMarchas, velocidade);
		this.alturadoAssento = alturadoAssento;
	}
	
	
	public void setAlturadoAssento(float alturadoAssento) {
		this.alturadoAssento = alturadoAssento;
	}
	
	public float getAlturadoAssento() {
		return this.alturadoAssento;
	}
	

	@Override
	public void tocaBuzina() {
		//super.tocaBuzina();
		System.out.println("be be be");
	}
}	
