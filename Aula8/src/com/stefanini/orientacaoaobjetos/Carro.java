package com.stefanini.orientacaoaobjetos;

public class Carro {

	private String marca;
	private String modelo;
	private int chassi;
	private String placa;
	private int roda;
	private int bancos;
	private int velocidade;

	public Carro() {
		System.out.println("Construindo um carro ");
	}

	public Carro(String marca) {
		this.marca = marca;
	}

	public String acelerar() {
		return velocidade + "Km/5s";
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getChassi() {
		return this.chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRoda() {
		return this.roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public int getBancos() {
		return this.bancos;
	}

	public void setBancos(int bancos) {
		this.bancos = bancos;
	}

}
