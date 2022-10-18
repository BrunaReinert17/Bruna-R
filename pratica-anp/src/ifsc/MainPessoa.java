package ifsc;

import java.util.ArrayList;

public class MainPessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> Aluninhos = new ArrayList<>();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Bruna ");
		aluno.setCpf(14758567938l);
		
		Aluninhos.add(aluno);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCpf());
		
        ArrayList<Pessoa> profs = new ArrayList<>();
		
		Professor prof = new Professor();
		prof.setNome("Roberta");
		prof.setCpf(13245678937l);
		
		profs.add(prof);
		
		System.out.println(prof.getNome());
		System.out.println(prof.getCpf());
	}


	}


