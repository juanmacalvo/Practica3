package com.mycompany.mavenproject1;
// Generated 06-abr-2019 2:03:50 by Hibernate Tools 4.3.1



/**
 * Colabora generated by hbm2java
 */
public class Colabora  implements java.io.Serializable {


     private ColaboraId id;
     private CasoPolicial casoPolicial;
     private Experto experto;
     private String descripcionColaboracion;

    public Colabora() {
    }

	
    public Colabora(ColaboraId id, CasoPolicial casoPolicial, Experto experto) {
        this.id = id;
        this.casoPolicial = casoPolicial;
        this.experto = experto;
    }
    public Colabora(ColaboraId id, CasoPolicial casoPolicial, Experto experto, String descripcionColaboracion) {
       this.id = id;
       this.casoPolicial = casoPolicial;
       this.experto = experto;
       this.descripcionColaboracion = descripcionColaboracion;
    }
   
    public ColaboraId getId() {
        return this.id;
    }
    
    public void setId(ColaboraId id) {
        this.id = id;
    }
    public CasoPolicial getCasoPolicial() {
        return this.casoPolicial;
    }
    
    public void setCasoPolicial(CasoPolicial casoPolicial) {
        this.casoPolicial = casoPolicial;
    }
    public Experto getExperto() {
        return this.experto;
    }
    
    public void setExperto(Experto experto) {
        this.experto = experto;
    }
    public String getDescripcionColaboracion() {
        return this.descripcionColaboracion;
    }
    
    public void setDescripcionColaboracion(String descripcionColaboracion) {
        this.descripcionColaboracion = descripcionColaboracion;
    }




}


