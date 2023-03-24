package com.adecco.presentacion;

import com.adecco.modelo.Area;

public class Main {
    public static void main(String[] args) {

        Area a1 = new Area();
        System.out.println("El area del cuadrado es = "+
                a1.areaRectangulo(4f,5f));
        System.out.println( "El area del circulo es = "+
                a1.areaCirculo(6.77f));
    }
}