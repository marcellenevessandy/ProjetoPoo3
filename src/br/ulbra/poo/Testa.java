package br.ulbra.poo;

import java.util.Scanner;

public class Testa {

    public static void main(String[] args) {
        int op;
        op = 4;
        Scanner ler = new Scanner(System.in);
        Funcionario func = new Funcionario();

        while (op != 0) {
            System.out.println("Digite: "
                    + "\n1 - Cadastro"
                    + "\n2 - Calcular Salário"
                    + "\n3 - Mostrar Funcionario"
                    + "\n0 - Sair");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    ler.nextLine();
                    System.out.println("Nome Funcionario:");
                    func.setNomeFuncionario(ler.nextLine());
                    System.out.println("Cargo:");
                    func.setCargo(ler.nextLine());
                    System.out.println("Valor Hora:");
                    func.setValorHora(ler.nextDouble());
                    System.out.println("Total Hora:");
                    func.setTotalHora(ler.nextDouble());
                    System.out.println("Descontos:");
                    func.setDescontos(ler.nextDouble());
                    System.out.println("Funcionário salvo com sucesso!");
                    break;
                case 2:
                    func.calcularSalarioLiquido();
                    break;
                case 3:
                    System.out.println("Funcionário Cadastrado");
                    System.out.println("Nome Funcionário; " + func.getNomeFuncionario());
                    System.out.println("Cargo: " + func.getCargo());
                    System.out.println("Valor Hora: " + func.getValorHora());
                    System.out.println("Total Hora: " + func.getTotalHora());
                    System.out.println("Descontos: " + func.getDescontos());
                    func.calcularSalarioLiquido();
            }
        }
    }
}
