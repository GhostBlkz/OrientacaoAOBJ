package lista1.exe4;

import java.text.DecimalFormat;

public class Rio {
    public String nome;
    public  float nivel;
    public boolean poluido;

    public Rio (String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;

    }
    public Rio(){
        
    }

    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarado(float x){
        if(x > this.nivel){
            this.nivel = 0;
        }
        else {
            this.nivel -= x;
        }
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public void mostrarDados(){
        //criar um objeto da classe DecimalFormat
        DecimalFormat df = new DecimalFormat("0,00");
        System.out.println("Nome do rio: "+this.nome+" \nEsta em: "+df.format(this.nivel)+" metros"+ "\nPoluido: "+(this.poluido ? "sim": "não"));
        }
    
}
