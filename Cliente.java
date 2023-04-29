package EnvioStrategy;

public class Cliente {
	public static void main() {
		EnvioContext ecx=new EnvioContext();
		
		ecx.setEnvioStrategy(new EnvioBus());
		
		String bus="Bus";
		String avion="Avion";
		String barco="Barco";
		ecx.MedioEnvio(bus);
		ecx.MedioEnvio(avion);
		ecx.MedioEnvio(barco);
		
	}

}
