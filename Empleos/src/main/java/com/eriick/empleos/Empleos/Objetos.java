package com.eriick.empleos.Empleos;

import com.eriick.empleos.Empleos.Model.Vacante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class Objetos {

    public static List<Vacante> GetListVacantes(){
        List<Vacante> getList = new LinkedList<Vacante>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try{
            // Objeto Vcante 1
            Vacante vacante1 = new Vacante();
            vacante1.setId(1);
            vacante1.setNombre("Ingeniero Civil");
            vacante1.setDescripcion("Solicitamos Ing. Cilvil parqa diseñar puente peatonal.");
            vacante1.setFecha(sdf.parse("09-02-2023"));
            vacante1.setSalario(12909.0);
            vacante1.setActivo(true);

            // Objeto Vcante 2
            Vacante vacante2 = new Vacante();
            vacante2.setId(2);
            vacante2.setNombre("Ingeniero COmputacional");
            vacante2.setDescripcion("Solicitamos Ing. COmputacional para administracion de equipos.");
            vacante2.setFecha(sdf.parse("19-03-2023"));
            vacante2.setSalario(11233.0);
            vacante2.setActivo(true);


            // Objeto Vcante 3
            Vacante vacante3 = new Vacante();
            vacante3.setId(3);
            vacante3.setNombre("Dr en Fisica");
            vacante3.setDescripcion("Solicitamos Dr. Fisica gestion de calculos avanzados en mineria coomputacional.");
            vacante3.setFecha(sdf.parse("29-04-2023"));
            vacante3.setSalario(123143.0);
            vacante3.setActivo(false);

            getList.add(vacante1);
            getList.add(vacante2);
            getList.add(vacante3);

        } catch (ParseException e){
            System.out.println("Error: "+e.getMessage());

        }

        return getList;
    }
}
