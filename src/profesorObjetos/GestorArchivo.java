package profesorObjetos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorArchivo {

    public static void guardar(List<Profesor> lista) throws IOException {
        // File dir = new File("D:\\Archivo");
        File directory = new File(".");
        File file = new File(directory, "Profesores.txt");

        FileWriter fileWriter = new FileWriter(file);
        try(BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

        for (Profesor profesor : lista) {
            bufferedWriter.write(profesor.getID() + "$"
                    + profesor.getTipoEmpleado() + "$" + profesor.getNombre() + "$"
                    + profesor.getProfesion() + "$" + profesor.getNumHorasTrabajadas() + "$" + profesor.getValorHora() + "$" + profesor.getSalario() + "\n");
        }

        }
    }

    public static List<Profesor> cargar() throws IOException {
        List<Profesor> lista = new LinkedList<>();
        // File dir = new File("D:\\Archivo");
        File directory = new File(".");
        File file = new File(directory, "Profesores.txt");
       if (!file.exists()){
           throw new FileNotFoundException("El archivo Profesores.txt no existe");
       }
        FileReader fileReader = new FileReader(file);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            List<String> lineasArchivo = bufferedReader.lines().collect(Collectors.toList());
            lineasArchivo.forEach( linea -> {
  
                String[] stringArray = linea.split("[$]");
                
                Profesor profesor = new Profesor(stringArray[0], stringArray[1], stringArray[2], stringArray[3],
                        stringArray[4], stringArray[5], stringArray[6]);
                
                lista.add(profesor);
                 });
        }
        return lista;
    }
}
