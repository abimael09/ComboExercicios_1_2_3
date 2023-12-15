package ComboExercicios_1_2_3;

import javax.swing.*;

public class ComboExercicios_1_2_3{
    
    public static void main(String[] args){
        
        //1° Questao
        int num = 358;
        JOptionPane.showMessageDialog(null, " L:  "+num+"       |       E:  853");
        
        //2° Questão
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
        JOptionPane.showMessageDialog(null, "N° = " + A);
        
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Número:"));
        JOptionPane.showMessageDialog(null, "N° = " + B);
        
        int C = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um Número:"));
        JOptionPane.showMessageDialog(null, "N° = " + C);
        
        int Soma = A + B + C;
        
        JOptionPane.showMessageDialog(null, "Soma Total = " + Soma);
        
        //3° Questão
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a Base do Triângulo:"));
        JOptionPane.showMessageDialog(null, "Base do Triângulo = "+base);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a Altura do Triângulo:"));
        JOptionPane.showMessageDialog(null, "Base do Triângulo = "+altura);
        
        double areaTriangulo = base * altura / 2;
        
        JOptionPane.showMessageDialog(null, "O Triângulo de Base: "+base+" e Altura: "+altura+"\n possui Área de: "+areaTriangulo+".");
        
        System.out.println("\n Fim !!!\n");
    }
}

