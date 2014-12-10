class Servo {
	int angulo = 0;
	int limmax = 180;
	int limmin = 0;
	String nombre = "Ninguno";
	boolean activo = true;
	String var = "nose";
	void cambiarLimiteMax(int max) {
		limmax = max;
	}
	void cambiarLimiteMin(int min) {
		limmin = min;
	}
	void anguloCambiar(int anguloEntrante) {
		if (anguloEntrante > limmin && anguloEntrante < limmax) {
		angulo = anguloEntrante;
		} else {
			angulo=300;
		}
	}
	void cambiarEstado() {
		if(activo) {
			activo=false;
		} else {
			activo=true;
		}
	}
	void cambiarNombre(String nombreEs) {
		nombre = nombreEs;
	}
	void imprimirEstados() {
		if(activo) {
			var = "Encendido :D";
		} else {
			var = "Apagado :(";
		}
		System.out.print("Servo: ");
		System.out.print(nombre+"\n");
		System.out.println("LimMin: "+limmin+" LimMax: "+limmax+" Angulo: "+angulo+" En que estado est\u00e1? "+var);
	}
}
class IniciarServo {
	public static void main(String[] args) {
		Servo inferior = new Servo();
		Servo superior = new Servo();

		inferior.cambiarNombre("Juan");
		inferior.cambiarLimiteMin(45);
		inferior.cambiarLimiteMax(90);
		inferior.anguloCambiar(49);
		inferior.cambiarEstado();
		inferior.imprimirEstados();

		superior.cambiarNombre("Pedro por su casa");
		superior.cambiarLimiteMin(35);
		superior.cambiarLimiteMax(45);
		superior.anguloCambiar(49);
		superior.cambiarEstado();
		superior.cambiarEstado();
		superior.cambiarEstado();
		superior.cambiarEstado();
		superior.imprimirEstados();

	}
}