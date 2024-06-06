package br.com.pedrorego.testmaven.controller;

import br.com.pedrorego.testmaven.model.ContraCheque;

public class Emissao {

	public static void main(String[] args) {
		ContraCheque contracheque = ContraCheque.questionario();
		contracheque.relatorio();
	}
}
