package projeto_arquitetura.maven;

public enum EnumPotassio {
    CLORETO_DE_POTASSIO{
        public double valorElement(){
            return 58.0;
        }
    },
    SULFATO_DE_POTASSIO{
        public double valorElement(){
            return 52.0;
        }
    },
     SULFATO_DE_POTASSIO_E_MAGNESIO{
        public double valorElement(){
            return 22.0;
        }
    }, NITRATO_DE_POTASSIO{
        public double valorElement(){
            return 44.0;
        }
    };
    
    public abstract double valorElement();
}
