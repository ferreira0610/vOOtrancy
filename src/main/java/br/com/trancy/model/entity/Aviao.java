package vOOtrancy.src.main.java.br.com.trancy.model.entity;

public class Aviao extends Aeronave {
    private int maxLotacao;
    private int poltronasOcupadas;

    public Aviao(String marcaNome, String modeloNome, int lotacaoMaxima){
        super(marcaNome, modeloNome);
        this.maxLotacao = lotacaoMaxima;
        this.poltronasOcupadas = 4;
    }

    public int getLotacao(){
        return maxLotacao;
    }

    public void setOcupacao(int novosPassageiros){
        if (poltronasOcupadas <= maxLotacao){
            poltronasOcupadas += novosPassageiros;
        }
    }

    public int getTotalPassageiros(){
        return poltronasOcupadas;
    }

    public String decolar(){
        if (autorizado == true){
            return "Decolagem feita com sucesso!";
        } else{
            return "Decolagem não autorizada!";
        }
    }

    public String pousar(){
        if (autorizado == true){
            return "Pouso feito com sucesso.";
        } else {
            return "Pouso não autorizado.";
        }
    }
}
