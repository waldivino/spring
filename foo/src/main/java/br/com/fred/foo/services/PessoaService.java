package br.com.fred.foo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fred.foo.model.Pessoa;

@Service
public class PessoaService {
	
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	Pessoa pessoa;
	
	public Pessoa findById(String id) {
		pessoa.setId(counter.incrementAndGet());
		pessoa.setPrimeiroNome("Waldivino");
		pessoa.setSobrenome("Frederico");
		pessoa.setComplemento("Apt 32");
		pessoa.setEndereco("Rua cap Bernardo Sanches Pimenta");
		return pessoa ;
	}
	
	public List<Pessoa> findAll() {
		List<Pessoa> pessoas =  new ArrayList<Pessoa>();
		for (int i = 0; i < 8; i++) {
			pessoa = mockPessoa(i);
			pessoas.add(pessoa);
		}
		return pessoas ;
	}

	private Pessoa mockPessoa(int i) {
		pessoa.setId(counter.incrementAndGet());
		pessoa.setPrimeiroNome("Waldivino");
		pessoa.setSobrenome("Frederico");
		pessoa.setComplemento("Apt 32 " + i);
		pessoa.setEndereco("Rua cap Bernardo Sanches Pimenta");
		return pessoa;
	}

}
