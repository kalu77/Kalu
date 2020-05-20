import java.util.ArrayList;

public class Principal_clase {

	public static void main(String[] args) {

		ArrayList<Vehiculos> ArrayVeh = new ArrayList<Vehiculos>();

		Vehiculos vh1 = new Vehiculos();
		vh1.setNombre("Renault");
		vh1.setColor("Negro");
		vh1.setModelo(2020);
		ArrayVeh.add(vh1);

		Vehiculos vh2 = new Vehiculos();
		vh1.setNombre("Toyota");
		vh1.setColor("Rojo");
		vh1.setModelo(2018);
		ArrayVeh.add(vh2);

		Vehiculos vh3 = new Vehiculos();
		vh1.setNombre("Nissan");
		vh1.setColor("Azul");
		vh1.setModelo(2029);
		ArrayVeh.add(vh3);

		AutoNuevo(ArrayVeh);
		AutoAntiguo(ArrayVeh);
	}

	private static void AutoNuevo(ArrayList<Vehiculos> arrayVeh) {

		Vehiculos masNuevo = new Vehiculos();
		int vuelta = 0;

		for (Vehiculos vehiculos : arrayVeh) {
			vuelta = vuelta + 1;
			if (vuelta == 1) {
				masNuevo = vehiculos;
			} else if (masNuevo.getModelo() < vehiculos.getModelo()) {
				masNuevo = vehiculos;
			}

		}
        System.out.println("El auto mas nuevo es del año: " + masNuevo.getModelo());
	}

	private static void AutoAntiguo(ArrayList<Vehiculos> arrayVeh) {
		
		Vehiculos masAntiguo = new Vehiculos();
		int vuelta = 0;

		for (Vehiculos vehiculosantiguos : arrayVeh) {
			vuelta = vuelta + 1;
			if (vuelta == 1) {
				masAntiguo = vehiculosantiguos;
			} else if (masAntiguo.getModelo() > vehiculosantiguos.getModelo()) {
				masAntiguo = vehiculosantiguos;
			}

		}
        System.out.println("El auto mas antiguo es del año: " + masAntiguo.getModelo());
	}

}
