package com.example.ProjetoExemploFunc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "venda")
public class Venda {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "Data venda", nullable = false, length = 100)
	private String dataVenda;
	
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;
	
}