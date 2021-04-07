package projeto_arquitetura.maven;

public enum Solos {

    ARGILOSO{
        public Elements calculaValoresIdeais(){
           return  new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0); 
        }
     },
     
    TEXTURA_MEDIA{
          public Elements calculaValoresIdeais(){
            return new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0);
          }
     };
     public abstract Elements calculaValoresIdeais();
}