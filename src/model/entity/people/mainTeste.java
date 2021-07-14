package model.entity.people;

import java.util.Scanner;

import model.entity.address.Endereco;
import model.entity.contact.Contato;

public class mainTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Sete seus atributos : ");

		PessoaFisica p = new PessoaFisica("Bruno", "098", (byte) 17, "56", "as", "gad");

		System.out.println(p.getNome());
		System.out.println(p.getDataNascimento());
		System.out.println(p.getFisicaCpf());
		System.out.println(p.getFisicaIdade());
		
		System.out.println("--------------------------------------------------------------------");
		
		
		Contato deusmeajuda = new Contato("sdasd@", "123");
		
		System.out.println(deusmeajuda.getContatoEmail());
		System.out.println(deusmeajuda.getContatoNumeroDeCelular());
		sc.close();
	}
	
}