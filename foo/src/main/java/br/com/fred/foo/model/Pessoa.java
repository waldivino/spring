package br.com.fred.foo.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String primeiroNome;
	private String sobrenome;
	private String endereco;
	private String complemento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(complemento, endereco, id, primeiroNome, sobrenome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(complemento, other.complemento) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(id, other.id) && Objects.equals(primeiroNome, other.primeiroNome)
				&& Objects.equals(sobrenome, other.sobrenome);
	}
	
	public Pessoa(Long id, String primeiroNome, String sobrenome, String endereco, String complemento) {
		super();
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.complemento = complemento;
	}
	public Pessoa() {
	}

}
