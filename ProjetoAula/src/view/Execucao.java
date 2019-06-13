package view; // Pacote atual

	// Importando bibliotecas
	import javax.swing.JOptionPane; // Biblioteca do JOptionPane (permite fazer o 'system.out.println' com uma pequena janela gráfica
	import model.Professor; // Importa os itens do pacote 'professor'

	//Iniciando o código, classe atual
public class Execucao {
	
	// Método main
	public static void main(String[] args) {
		Professor prof = new Professor (); //Instanciando a classe professor
		
		// Definindo variaveis inuteis
		int cont = 0;
		int cunt = 0;
		
		// Definindo vetores uteis
		String disc [] = new String [100];
		String curs [] = new String [100];
		
		// Enviando dados para as variaveis do outro pacote
		prof.setNome(JOptionPane.showInputDialog (null, "Nome"));
		prof.setEndereco(JOptionPane.showInputDialog (null, "Endereço"));
		prof.setBairro(JOptionPane.showInputDialog (null, "Bairro"));
		prof.setCep(Integer.parseInt(JOptionPane.showInputDialog (null, "CEP")));
		prof.setCidade(JOptionPane.showInputDialog (null, "Cidade"));
		prof.setEstado(JOptionPane.showInputDialog (null, "Estado"));
		prof.setRg(Integer.parseInt(JOptionPane.showInputDialog (null, "RG")));
		prof.setCpf(Integer.parseInt(JOptionPane.showInputDialog (null, "CPF")));
		
		// Usando try onde ele irá identificar o erro que pode ou não acontecer caso algo fora do correto aconteça
		try {
			// Pedindo dados ao usuario
			int dis = Integer.parseInt (JOptionPane.showInputDialog (null, "Quantas disciplinas você possui ?"));
			int dis1 = dis + 1;
			// Definindo valor do vetor
			String disciplinas [] = new String [dis1];
			for (int i = 1; i <= dis; i++) { // Iniciando um laço para oedir informações para o usuario de forma correta
				disciplinas [i] = JOptionPane.showInputDialog (null, "Digite a disciplina " + i);
				disc [i] = disciplinas [i];
				cont++;
			}
			prof.setDisciplinas (disciplinas); // Salvando dados em disciplinas que na verdade é um vetor no outro pacote
		}catch (Exception e) { // Não lembro, não me julgue
			e.printStackTrace();
		}
		
		// A mesma coisa da linha anterior só que com curso
		try {
			int cur = Integer.parseInt (JOptionPane.showInputDialog (null, "Quantos cursos você possui ?"));
			int cur1 = cur + 1;
			String cursos [] = new String [cur1];
			for (int i = 1; i <= cur; i++) {
				cursos [i] = JOptionPane.showInputDialog (null, "Digite o curso " + i);
				curs [i] = cursos [i];
				cunt++;
			}
			prof.setCursos (cursos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Apresentando os dados enviados anteriormente	
		JOptionPane.showMessageDialog(null, "Nome: " + prof.getNome() + "\nEndereço: " + prof.getEndereco() + "\nBairro: "
									+ prof.getBairro() + "\nCEP: "+ prof.getCep() + "\nCidade: " + prof.getCidade() + 
									"\nEstado: " + prof.getEstado() + "\nRG: " + prof.getRg() + "\nCPF: " + prof.getCpf());
		
		// Detectando erros caso tenha nessa apresentação
		try {
			for (int i = 1; i < prof.getDisciplinas().length; i++) {
				JOptionPane.showMessageDialog(null, prof.getDisciplinas()[i]); 
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// A mesma função da linha acima
		try {
			for (int i = 1; i < prof.getCursos().length; i++) {
				JOptionPane.showMessageDialog(null, prof.getCursos()[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}