package projeto_arquitetura.maven;

public enum EnumPotassio {
    cloreto_de_potassio{
        public double valorElement(){
            return 58.0;
        }
    },
    sulfato_de_potassio{
        public double valorElement(){
            return 52.0;
        }
    },
     sulfato_de_potassio_e_magnesio{
        public double valorElement(){
            return 22.0;
        }
    }, nitrato_de_potassio{
        public double valorElement(){
            return 44.0;
        }
    };
    
    public abstract double valorElement();
}
