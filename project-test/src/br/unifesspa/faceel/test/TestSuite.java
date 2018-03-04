package br.unifesspa.faceel.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCalculadora.class,
	TestCalculadoraDivisao.class,
	TestConta.class
})
public class TestSuite {

}
