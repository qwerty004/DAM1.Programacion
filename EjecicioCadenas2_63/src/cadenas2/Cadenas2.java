package cadenas2;

class Cadenas2 {

    static void cadenas2() {
        boolean bandera_nom, bandera_ape1, bandera_ape2;
        String cadenaTotal, nom, ape1, ape2, cadenaIniciales;
        StringBuffer nomC = new StringBuffer();
        StringBuffer ape1C = new StringBuffer();
        StringBuffer ape2C = new StringBuffer();


        do {
            nom = Lectura.leerString("Dime tu nombre");
            bandera_nom = true;
            if (nom.length() == 0) {
                bandera_nom = false;
            }
            for (int i = 0; i < nom.length() && bandera_nom == true; i++) {
                if (nom.charAt(i) != ' ' && Character.isLetter(nom.charAt(i)) == false) {
                    bandera_nom = false;
                    System.out.println("El nombre tiene un formato no admitido. Repite la entrada de datos");
                }
            }
        } while (bandera_nom == false);

        do {
            ape1 = Lectura.leerString("Ahora tu primer apellido");
            bandera_ape1 = true;
            if (ape1.length() == 0) {
                bandera_ape1 = false;
            }
            for (int i = 0; i < ape1.length() && bandera_ape1 == true; i++) {
                if (ape1.charAt(i) != ' ' && Character.isLetter(ape1.charAt(i)) == false) {
                    bandera_ape1 = false;
                    System.out.println("El apellido 1 tiene un formato no admitido. Repite la entrada de datos");
                }
            }
        } while (bandera_ape1 == false);

        do {
            ape2 = Lectura.leerString("Dime tu segundo apellido");
            bandera_ape2 = true;
            if (ape2.length() == 0) {
                bandera_ape2 = false;
            }
            for (int i = 0; i < ape2.length() && bandera_ape2 == true; i++) {
                if (ape2.charAt(i) != ' ' && Character.isLetter(ape2.charAt(i)) == false) {
                    bandera_ape2 = false;
                    System.out.println("El apellido 2 tiene un formato no admitido. Repite la entrada de datos");
                }
            }
        } while (bandera_ape2 == false);

        cadenaTotal = nom + ape1 + ape2;
        System.out.println("Cadena total : " + cadenaTotal);
        cadenaIniciales = (Character.toUpperCase(nom.charAt(0)))
                + "." + (Character.toUpperCase(ape1.charAt(0)))
                + "." + (Character.toUpperCase(ape2.charAt(0)));

        System.out.println("iniciales = " + cadenaIniciales);
        
        nomC.append(Character.toUpperCase(nom.charAt(0)));
        for (int i = 1; i < nom.length(); i++) {
            nomC.append(nom.charAt(i));            
        }
        System.out.println("Nombre bien escrito: "+nomC);
        
  
        System.out.println("Nombre bien escrito: "+nomC);
        
    }

}
