package org.example.accessmodifiers;

public class Test {
    public String public_variable = "public degisken";
    protected String protected_variable = "protected degisken";
    String constant = "default degisken";
    private String secret = "private degisken";


    public String getGizli() {
        return this.secret;
    }

    public static void main(String[] args) {

        Test testObjesi = new Test();

        System.out.println("Erisebildiğim değiskenler : " + testObjesi.secret +
                testObjesi.constant + " " + testObjesi.public_variable  + testObjesi.protected_variable);

    }

}
