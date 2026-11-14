
public final class Carro {

    enum Motor {
        V6, V8, V12
    }

    enum Pintura {
        ROJO_ULTRA, AZUL_SIMPLE, NEGRO_PERLADO
    }

    enum TipoCarroceria {
        SEDAN, HASHBACK
    }

    enum Rin {
        R16, R18, R20
    }

    //Debido al requerimiento de inmutabilidad de estas variables, es necesario definirlas como private y
    //crear un constructor en donde vamos a setear el valor de cada una de ellas. Si este no fuera un
    //requerimiento, no habría necesidad de definir un constructor con todas las variables.
    private final TipoCarroceria carroceria;
    private final Pintura pintura;
    private final Motor motor;
    private final Rin rin;
    private final boolean tieneGPS;

    Carro(TipoCarroceria carroceria, Pintura pintura, Motor motor, Rin rin, boolean tieneGPS) {
        this.carroceria = carroceria;
        this.pintura = pintura;
        this.motor = motor;
        this.rin = rin;
        this.tieneGPS = tieneGPS;
    }

    //Getters
    public TipoCarroceria getCarroceria() {
        return this.carroceria;
    }

    public Pintura getPintura() {
        return this.pintura;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public Rin getRin() {
        return this.rin;
    }

    public boolean tieneGPS() {
        return this.tieneGPS;
    }

    @Override
    public String toString() {
        return "pintura: " + pintura + ", motor: " + motor + ", carroceria: " + carroceria + ", rin: " + rin + ", tiene GPS: " + tieneGPS;
    }
}


