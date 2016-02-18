/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import net.daw.bean.colegio.Asignatura;
import net.daw.bean.colegio.Centro;
import net.daw.bean.colegio.Curso;
import net.daw.bean.colegio.Estudiante;
import net.daw.bean.colegio.Estudio;
import net.daw.bean.colegio.Profesor;
import net.daw.bean.colegio.TipoAsignatura;

/**
 *
 * @author rafa
 *
 */
public class ColegioMaker {

    public String getColegio() throws Exception {

        int numcentros = Aleatorio.randInt(2, 5);
        ArrayList<Centro> centros = new ArrayList<>();

        for (int contador = 1; contador <= numcentros; contador++) {

            Centro oCentro = new Centro(1);
            oCentro.setNombre(Aleatorio.dameCentro());

            int numestudios = Aleatorio.randInt(1, 5);
            for (int contador1 = 1; contador1 <= numestudios; contador1++) {

                Estudio oEstudio = new Estudio(contador1);
                oEstudio.setDescripcion(Aleatorio.dameEstudio());

                int numcursos = Aleatorio.randInt(2, 5);

                for (int contador2 = 1; contador2 <= numcursos; contador2++) {

                    Curso oCurso = new Curso(contador2);
                    oCurso.setNombre(Aleatorio.dameCurso(contador2));

                    int numasignaturas = Aleatorio.randInt(1, 3);
                    for (int contador3 = 1; contador3 <= numasignaturas; contador3++) {
                        Asignatura oAsignatura = new Asignatura(contador3);

                        oAsignatura.setNombre(Aleatorio.dameAsignatura());

                        int numestudiantes = Aleatorio.randInt(3, 10);
                        for (int contador4 = 1; contador4 <= numestudiantes; contador4++) {
                            Estudiante oEstudiante = new Estudiante(contador4);
                            oEstudiante.setExpediente(Aleatorio.randInt(1, 100000));
                            oEstudiante.setNombre(Aleatorio.dameNombre());
                            oEstudiante.setPrimerApellido(Aleatorio.dameApellido());
                            oEstudiante.setSegundoApellido(Aleatorio.dameApellido());
                            oEstudiante.setTelefono(Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9) + Aleatorio.randStr(0, 9));
                            oEstudiante.setDireccion("Calle " + Aleatorio.dameNombre() + " " + Aleatorio.dameApellido() + ", " + Aleatorio.randStr(0, 9));
                            oEstudiante.setPoblacion("Valencia");
                            oEstudiante.setEmail(EliminaAcentos.remove(oEstudiante.getNombre().substring(2) + oEstudiante.getPrimerApellido().substring(2) + oEstudiante.getSegundoApellido().substring(2)) + "@email.com");
                            oAsignatura.getEstudiantes().add(oEstudiante);
                        }
                        Profesor oProfesor = new Profesor();
                        oProfesor.setId(Aleatorio.randInt(1, 100000));
                        oProfesor.setNombre(Aleatorio.dameNombre());
                        oProfesor.setPrimerApellido(Aleatorio.dameApellido());
                        oProfesor.setSegundoApellido(Aleatorio.dameApellido());
                        oProfesor.setEmail(EliminaAcentos.remove(oProfesor.getNombre().substring(2) + oProfesor.getPrimerApellido().substring(2) + oProfesor.getSegundoApellido().substring(2)) + "@email.com");
                        oAsignatura.setProfesor(oProfesor);

                        TipoAsignatura oTipoAsignatura = new TipoAsignatura();
                        oTipoAsignatura.setId(Aleatorio.randInt(1, 100000));
                        oTipoAsignatura.setDescripcion(Aleatorio.dameTipoAsignatura());
                        oAsignatura.setTipo(oTipoAsignatura);

                        oCurso.getAsignaturas().add(oAsignatura);

                    }

                    oEstudio.getCursos().add(oCurso);

                }
                oCentro.getEstudios().add(oEstudio);
            }
            centros.add(oCentro);
        }

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy/MM/dd");
        Gson gson = gsonBuilder.create();
        String resultado = gson.toJson(centros);
        return resultado;

    }
}
