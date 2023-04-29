package EnvioStrategy;

public class EnvioContext {
	private EnvioStrategy strategy;
	
	public void setEnvioStrategy(EnvioStrategy strategy) {
		this.strategy=strategy;
	}
	
	public void MedioEnvio(String medio) {
		strategy.Envio(medio);
		System.out.println("El medio de envio seleccionado es: "+medio);
	}

}
