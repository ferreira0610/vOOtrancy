package vOOtrancy.src.main.java.br.com.trancy.model.entity;

public abstract class Aeronave {
    protected String marca;
    protected String modelo;
    protected boolean autorizado;

    public Aeronave(String marcaNome, String modeloNome){
        this.modelo = modeloNome;
        this.marca = marcaNome;
        this.autorizado = false;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setAutorizar(){
        if (this.autorizado == false) {
            this.autorizado = true;
        } else {
            this.autorizado = false;
        }
    }

    public boolean getAutorizacao(){
        return this.autorizado;
    }

    public abstract String decolar();

    public abstract String pousar();
}
