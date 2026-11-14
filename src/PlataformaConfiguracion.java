public class PlataformaConfiguracion {
    private ConfiguradorCarro configurador;

    public PlataformaConfiguracion(ConfiguradorCarro configurador) {
        this.configurador = configurador;
    }

    //Tenemos diferentes métodos para crear carros ya predeterminados
    public Carro configurarCarroEconomico() {
        this.configurador.resetearConfiguracion();
        this.configurador.configurarPintura(Carro.Pintura.AZUL_SIMPLE);
        this.configurador.configurarRin(Carro.Rin.R16);
        this.configurador.configurarMotor(Carro.Motor.V6);
        this.configurador.agregarGPS(false);
        this.configurador.configurarCarroceria(Carro.TipoCarroceria.HASHBACK);
        Carro carroFinal = this.configurador.confirmarCarro();
        return carroFinal;
    }

    public Carro configurarCarroGamaMedia() {
        this.configurador.resetearConfiguracion();
        this.configurador.configurarPintura(Carro.Pintura.NEGRO_PERLADO);
        this.configurador.configurarRin(Carro.Rin.R18);
        this.configurador.configurarMotor(Carro.Motor.V8);
        this.configurador.agregarGPS(false);
        this.configurador.configurarCarroceria(Carro.TipoCarroceria.HASHBACK);
        Carro carroFinal = this.configurador.confirmarCarro();
        return carroFinal;
    }

    public Carro configurarCarroGamaAlta() {
        this.configurador.resetearConfiguracion();
        this.configurador.configurarPintura(Carro.Pintura.ROJO_ULTRA);
        this.configurador.configurarRin(Carro.Rin.R20);
        this.configurador.configurarMotor(Carro.Motor.V12);
        this.configurador.agregarGPS(true);
        this.configurador.configurarCarroceria(Carro.TipoCarroceria.SEDAN);
        Carro carroFinal = this.configurador.confirmarCarro();
        return carroFinal;
    }

    //En caso de que el usuario lo requiera, puede crear un carro personalizado a través
    //de este configurador
    public ConfiguradorCarro configuradorPersonalizado() {
        return new ConfiguradorCarro();
    }
}
