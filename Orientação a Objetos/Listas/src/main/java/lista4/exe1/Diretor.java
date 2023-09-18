/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.exe1;

/**
 *
 * @author 1090482211010
 */
public class Diretor extends Funcionario{
    private float acoesEmpresa;

    public Diretor() {
        super();
    }

    public Diretor(float acoesEmpresa, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.setAcoesEmpresa(acoesEmpresa);
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public final void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" + "acoesEmpresa=" + acoesEmpresa + super.toString() + '}';
    }
    @Override
    public float calculaSalario(){
        return this.salario + (this.acoesEmpresa*12) /12;
    }
    
    
    
}
