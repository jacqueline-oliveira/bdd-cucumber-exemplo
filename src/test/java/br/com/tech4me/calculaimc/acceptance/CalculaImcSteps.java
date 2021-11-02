package br.com.tech4me.calculaimc.acceptance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.tech4me.calculaimc.model.CalculadoraImc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculaImcSteps {
	
	private CalculadoraImc calculadora = new CalculadoraImc();
	
	@Given("Usuario informou o peso {double}")
	public void usuario_informou_o_peso(Double peso) {
	   calculadora.setPeso(peso);
	}

	@Given("Usuario informou a altura {double}")
	public void usuario_informou_a_altura(Double altura) {
	    calculadora.setAltura(altura);
	}

	@When("pedir para calcular")
	public void pedir_para_calcular() {
	    calculadora.calcular();
	}

	@Then("demonstra o imc {double}")
	public void demonstra_o_imc(Double imc) {
	    assertEquals(imc, calculadora.getImc());
	}

	@Then("demonstra a classificacao {string}")
	public void demonstra_a_classificacao(String classificacao) {
	   assertEquals(classificacao, calculadora.getClassificacao());
	}
	

}
