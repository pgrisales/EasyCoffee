/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasPrimerNivel;

import WebS.PrecioCafe;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilo Vargas
 */
public class CargaPrecioCafe {

//    private static PrecioCafe precioCafe = PrecioCafe.getInstance();
    public CargaPrecioCafe() {
    }

    @Test
    public void solicitarPrecioCafé() throws IOException {
        PrecioCafe precioCafe = PrecioCafe.getInstance();
        precioCafe.updateInfo();
        System.out.println("");
        System.out.println("Precio Café en la Bolsa: " + (Double.parseDouble(precioCafe.getBolsaNY().replace(".", "").replace(",", ".").replace("$", "")) * 0.01) + " USD por Libra de Café Básico");
        System.out.println("Precio Interno Referencia: $" + Double.parseDouble(precioCafe.getPrecioInternoRef().replace(".", "").replace(",", ".").replace("$", "")) + "COP por Carga de Café");
        System.out.println("Precio Pasilla de Finca: $" + Double.parseDouble(precioCafe.getPrecioPasillaFinca().replace(".", "").replace(",", ".").replace("$", "")) + " COP por Arroba de Cafe >= 50 Puntos");
        System.out.println("Tasa de Cambio, Dolar Hoy: $" + Double.parseDouble(precioCafe.getTasaCambio().replace(".", "").replace(",", ".").replace("$", "")) + "COP por Dolar");
        System.out.println("");
    }
}
