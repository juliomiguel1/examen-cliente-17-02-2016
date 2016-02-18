/*
 * Copyright (C) 2014 raznara
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package net.daw.control;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raznara
 */
public class Aleatorio {

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static String randStr(int min, int max) {
        Random rand = new Random();
        Integer randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum.toString();
    }

    public static Double randDbl(int min, int max) {
        Random r = new Random();
        double randomValue = min + (max - min) * r.nextDouble();
        return randomValue;
    }

    public static String dameHerramienta() {
        Random generator;
        generator = new Random();
        ArrayList<String> uno = new ArrayList<>();
        ArrayList<String> dos = new ArrayList<>();
        ArrayList<String> tres = new ArrayList<>();
        uno.add("Llave");
        uno.add("Soldadura");
        uno.add("Pieza");
        uno.add("Bote");
        uno.add("Asadura");
        uno.add("Mecanizado");
        uno.add("Bote");
        uno.add("Manivela");
        uno.add("Pasante");
        uno.add("Rejilla");
        uno.add("Torno");
        uno.add("Accionamiento");
        uno.add("Fijación");
        uno.add("Bajante");
        uno.add("Sujeción");

        dos.add("auxiliar");
        dos.add("manual");
        dos.add("con rodadura");
        dos.add("extensivo");
        dos.add("intensivo");
        dos.add("circular");

        tres.add("de emergencia");
        tres.add("de repuesto");
        tres.add("de paso");
        tres.add("de acople");
        tres.add("de mano");
        tres.add("de cizalla");
        tres.add("de agarre");

        String unoh = uno.get(generator.nextInt(uno.size()));
        String dosh = dos.get(generator.nextInt(dos.size()));
        String tresh = tres.get(generator.nextInt(tres.size()));
        return unoh + " " + dosh + " " + tresh;
    }

    public static String dameAsignatura() {
        Random generator;
        generator = new Random();
        ArrayList<String> uno = new ArrayList<>();
        ArrayList<String> dos = new ArrayList<>();
        ArrayList<String> tres = new ArrayList<>();
        uno.add("Diseño");
        uno.add("Implementación");
        uno.add("Intensificación");
        uno.add("Revisiones");
        uno.add("Desplieue");
        uno.add("Laboratorio");
        uno.add("Desarrollo");
        uno.add("Ampliación");
        uno.add("Planificación");

        dos.add("de algoritmos");
        dos.add("de estructuras");
        dos.add("de entornos");
        dos.add("de programas");
        dos.add("de códigos");
        dos.add("de interfaces");

        tres.add("funcionales");
        tres.add("en bases de datos");
        tres.add("cuantificables");
        tres.add("de baja prioridad");
        tres.add("en tiempo real");
        tres.add("de alta prioridad");
        tres.add("redundantes");

        String unoh = uno.get(generator.nextInt(uno.size()));
        String dosh = dos.get(generator.nextInt(dos.size()));
        String tresh = tres.get(generator.nextInt(tres.size()));
        return unoh + " " + dosh + " " + tresh;
    }

    public static String dameCentro() {
        Random generator;
        generator = new Random();
        ArrayList<String> uno = new ArrayList<>();
        ArrayList<String> dos = new ArrayList<>();
        ArrayList<String> tres = new ArrayList<>();
        uno.add("Instituto");
        uno.add("Centro integrado");
        uno.add("Colegio");
        uno.add("Academia");
        uno.add("Centro educativo");
        uno.add("Centro de formación");

        dos.add("para el aprendizaje");
        dos.add("de capacitación");
        dos.add("de desarrollo");
        dos.add("de investigación");
        dos.add("de estudio");
        dos.add("para el análisis");

        tres.add("funcional");
        tres.add("en bases de datos");
        tres.add("para el desarrollo");
        tres.add("estatal");
        tres.add("autonómico");
        tres.add("integral");
        tres.add("inicial");

        String unoh = uno.get(generator.nextInt(uno.size()));
        String dosh = dos.get(generator.nextInt(dos.size()));
        String tresh = tres.get(generator.nextInt(tres.size()));
        return unoh + " " + dosh + " " + tresh;
    }

    public static String dameAula() {
        Random generator;
        generator = new Random();
        ArrayList<String> uno = new ArrayList<>();
        ArrayList<String> dos = new ArrayList<>();
        ArrayList<String> tres = new ArrayList<>();
        uno.add("Aula");
        uno.add("Laboratorio");
        uno.add("Colegio");
        uno.add("Academia");
        uno.add("Centro educativo");
        uno.add("Centro de formación");

        dos.add("del código");
        dos.add("de capacitación");
        dos.add("de desarrollo");
        dos.add("de investigación");
        dos.add("de estudio");

        tres.add("en el primer piso, número 1");
        tres.add("en el primer piso, número 2");
        tres.add("en el primer piso, número 3");
        tres.add("en el primer piso, número 4");
        tres.add("en el segundo piso, número 1");
        tres.add("en el segundo piso, número 2");
        tres.add("en el segundo piso, número 3");
        tres.add("en el segundo piso, número 4");
        tres.add("en el tercer piso, número 1");
        tres.add("en el tercer piso, número 2");
        tres.add("en el cuarto piso, número 1");
        tres.add("en el cuarto piso, número 2");

        String unoh = uno.get(generator.nextInt(uno.size()));
        String dosh = dos.get(generator.nextInt(dos.size()));
        String tresh = tres.get(generator.nextInt(tres.size()));
        return unoh + " " + dosh + " " + tresh;
    }

    public static String dameEstudio() {
        Random generator;
        generator = new Random();
        ArrayList<String> uno = new ArrayList<>();
        ArrayList<String> dos = new ArrayList<>();
        ArrayList<String> tres = new ArrayList<>();
        uno.add("Diseño e implementación");
        uno.add("Implementación y diseño");
        uno.add("Intensificación y revisión");
        uno.add("Despliegue y revisión");
        uno.add("Laboratorio de desarrollo");
        uno.add("Desarrollo y ampliación");
        uno.add("Ampliación y planificación");
        uno.add("Planificación y diseño");

        dos.add("de algoritmos");
        dos.add("de estructuras");
        dos.add("de entornos");
        dos.add("de programas");
        dos.add("de códigos");
        dos.add("de interfaces");

        tres.add("funcionales");
        tres.add("en bases de datos");
        tres.add("cuantificables");
        tres.add("de baja prioridad");
        tres.add("en tiempo real");
        tres.add("de alta prioridad");
        tres.add("redundantes");

        String unoh = uno.get(generator.nextInt(uno.size()));
        String dosh = dos.get(generator.nextInt(dos.size()));
        String tresh = tres.get(generator.nextInt(tres.size()));
        return "Títulación oficial de " + unoh + " " + dosh + " " + tresh;
    }

    public static String dameNombre() {
        Random generator;
        generator = new Random();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Santiago");
        arr.add("Sebastián");
        arr.add("Matías");
        arr.add("Mateo");
        arr.add("Nicolás");
        arr.add("Alejandro");
        arr.add("Diego");
        arr.add("Samuel");
        arr.add("Benjamín");
        arr.add("Daniel");
        arr.add("Joaquín");
        arr.add("Lucas");
        arr.add("Tomas");
        arr.add("Gabriel");
        arr.add("Martín");
        arr.add("David");
        arr.add("Emiliano");
        arr.add("Jerónimo");
        arr.add("Emmanuel");
        arr.add("Agustín");
        arr.add("Juan Pablo");
        arr.add("Juan José");
        arr.add("Andrés");
        arr.add("Thiago");
        arr.add("Leonardo");
        arr.add("Felipe");
        arr.add("Ángel");
        arr.add("Maximiliano");
        arr.add("Christopher");
        arr.add("Juan Diego");
        arr.add("Adrián");
        arr.add("Pablo");
        arr.add("Miguel Ángel");
        arr.add("Rodrigo");
        arr.add("Alexander");
        arr.add("Ignacio");
        arr.add("Emilio");
        arr.add("Dylan");
        arr.add("Bruno");
        arr.add("Carlos");
        arr.add("Vicente");
        arr.add("Valentino");
        arr.add("Santino");
        arr.add("Julián");
        arr.add("Juan Sebastián");
        arr.add("Aarón");
        arr.add("Lautaro");
        arr.add("Axel");
        arr.add("Fernando");
        arr.add("Ian");
        arr.add("Christian");
        arr.add("Javier");
        arr.add("Manuel");
        arr.add("Luciano");
        arr.add("Francisco");
        arr.add("Juan David");
        arr.add("Iker");
        arr.add("Facundo");
        arr.add("Rafael");
        arr.add("Alex");
        arr.add("Franco");
        arr.add("Antonio");
        arr.add("Luis");
        arr.add("Isaac");
        arr.add("Máximo");
        arr.add("Pedro");
        arr.add("Ricardo");
        arr.add("Sergio");
        arr.add("Eduardo");
        arr.add("Bautista");
        arr.add("Miguel");
        arr.add("Cristóbal");
        arr.add("Kevin");
        arr.add("Jorge");
        arr.add("Alonso");
        arr.add("Anthony");
        arr.add("Simón");
        arr.add("Juan");
        arr.add("Joshua");
        arr.add("Diego Alejandro");
        arr.add("Juan Manuel");
        arr.add("Mario");
        arr.add("Alan");
        arr.add("Josué");
        arr.add("Gael");
        arr.add("Hugo");
        arr.add("Matthew");
        arr.add("Ivan");
        arr.add("Damián");
        arr.add("Lorenzo");
        arr.add("Juan Martín");
        arr.add("Esteban");
        arr.add("Álvaro");
        arr.add("Valentín");
        arr.add("Dante");
        arr.add("Jacobo");
        arr.add("Jesús");
        arr.add("Camilo");
        arr.add("Juan Esteban");
        arr.add("Elías");

        arr.add("Sofía");
        arr.add("Isabella");
        arr.add("Camila");
        arr.add("Valentina");
        arr.add("Valeria");
        arr.add("Mariana");
        arr.add("Luciana");
        arr.add("Daniela");
        arr.add("Gabriela");
        arr.add("Victoria");
        arr.add("Martina");
        arr.add("Lucía");
        arr.add("Jimena");
        arr.add("Sara");
        arr.add("Samantha");
        arr.add("María José");
        arr.add("Emma");
        arr.add("Catalina");
        arr.add("Julieta");
        arr.add("Mía");
        arr.add("Antonella");
        arr.add("Renata");
        arr.add("Emilia");
        arr.add("Natalia");
        arr.add("Zoe");
        arr.add("Nicole");
        arr.add("Paula");
        arr.add("Amanda");
        arr.add("María Fernanda");
        arr.add("Emily");
        arr.add("Antonia");
        arr.add("Alejandra");
        arr.add("Juana");
        arr.add("Andrea");
        arr.add("Manuela");
        arr.add("Ana Sofía");
        arr.add("Guadalupe");
        arr.add("Agustina");
        arr.add("Elena");
        arr.add("María");
        arr.add("Bianca");
        arr.add("Ariana");
        arr.add("Ivanna");
        arr.add("Abril");
        arr.add("Florencia");
        arr.add("Carolina");
        arr.add("Maite");
        arr.add("Rafaela");
        arr.add("Regina");
        arr.add("Adriana");
        arr.add("Michelle");
        arr.add("Alma");
        arr.add("Violeta");
        arr.add("Salomé");
        arr.add("Abigail");
        arr.add("Juliana");
        arr.add("Valery");
        arr.add("Isabel");
        arr.add("Montserrat");
        arr.add("Allison");
        arr.add("Jazmín");
        arr.add("Julia");
        arr.add("Lola");
        arr.add("Luna");
        arr.add("Ana");
        arr.add("Delfina");
        arr.add("Alessandra");
        arr.add("Ashley");
        arr.add("Olivia");
        arr.add("Constanza");
        arr.add("Paulina");
        arr.add("Rebeca");
        arr.add("Carla");
        arr.add("María Paula");
        arr.add("Micaela");
        arr.add("Fabiana");
        arr.add("Miranda");
        arr.add("Josefina");
        arr.add("Laura");
        arr.add("Alexa");
        arr.add("María Alejandra");
        arr.add("Luana");
        arr.add("Fátima");
        arr.add("Sara Sofía");
        arr.add("Isidora");
        arr.add("Malena");
        arr.add("Romina");
        arr.add("Ana Paula");
        arr.add("Mariangel");
        arr.add("Amelia");
        arr.add("Elizabeth");
        arr.add("Aitana");
        arr.add("Ariadna");
        arr.add("María Camila");
        arr.add("Irene");
        arr.add("Silvana");
        arr.add("Clara");
        arr.add("Magdalena");
        arr.add("Sophie");
        arr.add("Josefa");
        String nom = arr.get(generator.nextInt(arr.size()));
        return nom;
    }

    public static String dameApellido() {
        Random generator;
        generator = new Random();
        ArrayList<String> arr = new ArrayList<>();

        arr.add("García");
        arr.add("Sancho");
        arr.add("Sanchís");
        arr.add("Gómez");
        arr.add("Giménez");
        arr.add("Montoya");
        arr.add("López");
        arr.add("Domínguez");
        arr.add("González");
        arr.add("Fernández");
        arr.add("Rodríguez");
        arr.add("Martínez");
        arr.add("Pérez");
        arr.add("Hernández");
        arr.add("Alvarez");
        arr.add("Gutierrez");
        arr.add("Belmonte");
        arr.add("Palomino");
        arr.add("Casanova");
        arr.add("Pelayo");
        String a = arr.get(generator.nextInt(arr.size()));
        return a;
    }

    public static String dameTipoProducto() {
        Random generator;
        generator = new Random();
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Herramienta");
        arr.add("Apero");
        arr.add("Utilidad");
        arr.add("Fungible");
        arr.add("Accesorio");
        String a = arr.get(generator.nextInt(arr.size()));
        return a;
    }

    public static String dameCurso(Integer c) {

        if (c == 1) {
            return "Primero";
        }
        if (c == 2) {
            return "Segundo";
        }
        if (c == 3) {
            return "Tercero";
        }
        if (c == 4) {
            return "Cuarto";
        }
        if (c == 5) {
            return "Quinto";
        }

        return "Acceso";
    }

    public static String dameTipoAsignatura() {
        Random generator;
        generator = new Random();
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Cuatrimestral");
        arr.add("Semestral");
        arr.add("Anual");
        String a = arr.get(generator.nextInt(arr.size()));
        return a;
    }
}
