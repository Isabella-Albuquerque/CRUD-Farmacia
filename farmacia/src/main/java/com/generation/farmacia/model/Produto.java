package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

	    @NotBlank(message = "O atributo nome é Obrigatório!")
	    @Size(min = 1, max = 100, message = "O atributo nome deve conter no mínimo 1 e no máximo 100 caracteres")
	    private String nome;
	    
	    @NotNull(message = "O atributo preço é obrigatório!")
	    @DecimalMin(value = "0.01", message = "O atributo preço deve ser maior que 0.00")
	    private Double preco;
	    
	    
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

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}

		

	}