package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest{

    @Test
    public void parametroEdadInvalida(){
        double tarifaBase = 100000; 
        int diasAntelacion = 20; 
        int edad = -32;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }

    @Test
    public void parametroEdadInvalidaLimite(){
        double tarifaBase = 100000; 
        int diasAntelacion = 20; 
        int edad = 1000;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
	
	Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }

    @Test
    public void deberiaAplicarDescuento5(){
        double tarifaBase = 100000;
        int diasAntelacion = 5; 
        int edad = 15;
	double ans = 95000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(tarifa==ans);
    }

    @Test
    public void noDeberiaAplicarDescuento2(){
        double tarifaBase = 150000; 
        int diasAntelacion = 2; 
        int edad = 25;
        double ans = 150000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(tarifa==ans);
    }

    @Test
    public void deberiaAplicarDescuento8(){
        double tarifaBase = 150000; 
        int diasAntelacion = 2; 
        int edad = 85;
	double ans = 138000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(tarifa==ans);
    }

    @Test
    public void parametroTarifaInvalida(){
        double tarifaBase = -200000;
        int diasAntelacion = 20; 
        int edad = 17;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }

    @Test
    public void parametroDiasInvalida(){
        double tarifaBase = 200000;
        int diasAntelacion = -1; 
        int edad = 17;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }

    @Test
    public void noDeberiaAplicarDescuento(){
        double tarifaBase = 150000; 
        int diasAntelacion = 6; 
        int edad = 30;
        double ans = 150000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void deberiaAplicarDescuento15(){
        double tarifaBase = 200000; 
        int diasAntelacion = 23; 
        int edad = 25;
        double ans = 170000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void deberiaAplicarDescuento20(){
        double tarifaBase = 150000; 
        int diasAntelacion = 25; 
        int edad = 10;
        double ans = 120000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void deberiaAplicarDescuento23(){
        double tarifaBase = 210000; 
        int diasAntelacion = 30; 
        int edad = 82;
        double ans = 161700.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void deberiaAplicarDescuento0(){
        double tarifaBase = 100000; 
        int diasAntelacion = 6; 
        int edad = 0;
        double ans = 95000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void nodeberiaAplicarDescuentoEdad18(){
        double tarifaBase = 210000; 
        int diasAntelacion = 4; 
        int edad = 18;
        double ans = 210000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void nodeberiaAplicarDescuentoEdad65(){
        double tarifaBase = 160000; 
        int diasAntelacion = 4; 
        int edad = 65;
        double ans = 160000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void deberiaAplicarDescuentoEdad100(){
        double tarifaBase = 210000; 
        int diasAntelacion = 4; 
        int edad = 100;
        double ans = 193200.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void noDeberiaAplicarDescuentoDias0(){
        double tarifaBase = 160000; 
        int diasAntelacion = 0; 
        int edad = 25;
        double ans = 160000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }

    @Test
    public void noDeberiaAplicarDescuentoDias20(){
        double tarifaBase = 180000; 
        int diasAntelacion = 20; 
        int edad = 18;
        double ans = 180000.0;

        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(ans==tarifa);
    }
}
