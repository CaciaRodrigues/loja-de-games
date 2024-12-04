package com.generation.lojadegames.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min = 1, max = 100, message = "O atributo nome deve conter entre 01 e 100 caracteres.")
	private String nome;
	
	@NotNull(message = "O atributo Valor é obrigatório!")
	@DecimalMin("0.01")
	@DecimalMax("1000.00")
	private BigDecimal preco;
	
	@NotBlank(message = "O atributo Classifição Indicativa é obrigatório!")
	private String classificacaoIndicativa;
	
	/* Classificações: 
	   Livre
	   Não recomendado para menores de 10 anos
	   Não recomendado para menores de 13 anos
	   Não recomendado para menores de 17 anos
	   Apenas para adultos maiores de 18 anos
	 */
	
	@NotNull(message = "O atributo Disponibilidade é obrigatório!")
	private Boolean disponibilidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public Boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	

}
