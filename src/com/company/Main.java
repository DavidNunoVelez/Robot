package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Robot Robbie=new Robot();
        int x=0;
        int y=0;
        String movimiento;
        do {
            System.out.println("¿Donde se va a mover?: ");
            movimiento=br.readLine().toLowerCase();

            switch (movimiento){
                case "izquierda":x=x-1;
                    break;
                case "derecha":x=x+1;
                    break;
                case "arriba":y=y+1;
                    break;
                case "abajo":y=y-1;
                    break;
            }
            Robbie.setX(x);
            Robbie.setY(y);

            if (x<=10 && y<=10 && x>=-10 && y>=-10) {
                System.out.println(Robbie.getX()+","+Robbie.getY());
            }else {
                System.out.println("Movimiento no permitido");
            }
        } while (x<=10 && y<=10 && x>=-10 && y>=-10);
    }
}
