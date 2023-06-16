package org.example.abstractclass_interface;
import org.example.accessmodifiers.Test;

public class OutsideErisim extends Test {
    public static void main(String[] args) {
        OutsideErisim outsideErisim = new OutsideErisim();

        System.out.println("Eristigim degiskenler : " +
                outsideErisim.korumali + outsideErisim.herkese);


    }
}
