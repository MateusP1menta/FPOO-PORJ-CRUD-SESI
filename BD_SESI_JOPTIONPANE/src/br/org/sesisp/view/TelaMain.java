package br.org.sesisp.view;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TelaMain {

	public static void main(String[] args) {
		/*
		//instanciar um objeto da classe CrudDAO
		CrudDAO inserir_aluno = new CrudDAO();
		//instanciar um objeto aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Marcelo");
		aluno1.setIdade(17);
		inserir_aluno.create(aluno1);
		System.out.println("Nome: " + aluno1.getNome() + " Idade: " + aluno1.getIdade());
		
		//*************************************************************************************************
		//att valores
		
		aluno1.setNome("Marcelo Vieira");
		aluno1.setIdade(32);
		aluno1.setRa(1);
		inserir_aluno.update(aluno1);
		System.out.println("Nome: " + aluno1.getNome() + " Idade: " + aluno1.getIdade());
		
		//*************************************************************************************************
		//ler tabela alunos do bd
		System.out.println("lendo a lista....");
		for(Aluno olho : inserir_aluno.read()) {
			System.out.println("dados do aluno: " + olho.getRa()+ " " + olho.getNome()+ " " + olho.getIdade());
		}
		//******************************************************************************************************
		//excluir dados
		CrudDAO remover_aluno = new CrudDAO();
		remover_aluno.delete(1);
		*/
		
		Scanner entrada = new Scanner(System.in);
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno1 = new Aluno();
		String menu = "1- Criar Aluno "+" \n  2- Atualizar Aluno "+" \n 3- Ver Lista "+" \n 4- Excluir Aluno";
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		do {
			switch(opcao) {
			case 1:
				aluno1.setNome(JOptionPane.showInputDialog("Digite um nome: "));
				aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
				inserir_aluno.create(aluno1);
				JOptionPane.showMessageDialog(null, "Nome: " + aluno1.getNome() + " Idade: " + aluno1.getIdade());
				break;
			case 2:
				aluno1.setNome(JOptionPane.showInputDialog("Digite um nome: "));
				aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
				aluno1.setRa(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ra: ")));
				inserir_aluno.update(aluno1);
				JOptionPane.showMessageDialog(null, "Nome: " + aluno1.getNome() + " Idade: " + aluno1.getIdade());
				break;
			case 3:
				
				for(Aluno olho : inserir_aluno.read()) {
					JOptionPane.showMessageDialog(null, "Dados do aluno: " + olho.getRa()+ " " + olho.getNome()+ " " + olho.getIdade());
				}
				break;
			case 4:
				
				CrudDAO remover_aluno = new CrudDAO();
				remover_aluno.delete(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ra: ")));
			}
		}while(opcao <= 0);
	}
		
}
