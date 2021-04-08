package projeto_arquitetura.maven;

public enum EnumFosforo {
    SUPERFOSTATO_SIMPLES {
        public double valorElement() {
            return 18.0;
        }
    },
    SUPERFOSFATO_TRIPLO {
        public double valorElement() {
            return 42.0;
        }
    },
    MAP {
        public double valorElement() {
            return 48.0;
        }
    },
    DAP {
        public double valorElement() {
            return 45.0;
        }
    },
    YOORIN {
        public double valorElement() {
            return 18.0;
        }
    },
    FOSFATO_ARAD {
        public double valorElement() {
            return 33.0;
        }
    },
    FOSFATO_GAFSA {
        public double valorElement() {
            return 29.0;
        }
    },
    FOSFATO_DAOUI {
        public double valorElement() {
            return 32.0;
        }
    },
    FOSF_PATOS_MINAS {
        public double valorElement() {
            return 24.0;
        }
    },
    ESCORIA_DE_THOMAS {
        public double valorElement() {
            return 18.5;
        }
    },
    ACIDO_FOSFORICO {
        public double valorElement() {
            return 52.0;
        }
    },
    MULTIF_MAGNESIANO {
        public double valorElement() {
            return 18.0;
        }
    };

    public abstract double valorElement();
}
