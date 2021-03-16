package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

	@RequestMapping("/getFactorial")
	public String helloworld() {
		long factorial = 0;
		for (int x = 0; x < 10; x++) {
			factorial = factorial(20);
		}		
		System.out.println("Hola, Bety!");
		System.out.println("Se calcula 10 veces el factorial de 20: " + factorial);
		return "Se calcula 10 veces el factorial de 20: " + factorial + " - by Bety";
	}

	public long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}