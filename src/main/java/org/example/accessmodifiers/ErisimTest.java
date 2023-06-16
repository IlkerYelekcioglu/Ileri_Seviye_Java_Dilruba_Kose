package org.example.accessmodifiers;

public class ErisimTest {
    public static void main(String[] args) {
        Test testObjesi = new Test();

        System.out.println("Erisebildigim degiskenler : " +
                testObjesi.constant + " " + testObjesi.public_variable + " " + testObjesi.protected_variable);

        System.out.println("Gizli :" + testObjesi.getGizli());
    }

}
