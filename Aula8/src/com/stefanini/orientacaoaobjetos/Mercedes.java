package com.stefanini.orientacaoaobjetos;

public class Mercedes extends Carro {

	public Mercedes() {
		this.setMarca("Mercedes");
	}

	@Override
	public String acelerar() {
		return "A Mercedes tem uma aceleração diferente para cada modelo";
	}
}
