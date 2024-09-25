package Disenio;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Obtener la fábrica (Singleton)
		JPADAOFactory daoFactory = JPADAOFactory.getInstance();

		// Obtener DAOS
		EstudianteDAO estudianteDao = daoFactory.createEstudianteDAO();
		CarreraDAO carreraDao = daoFactory.createCarreraDAO();
		CursaDAO cursaDao = daoFactory.createCursoDAO();
		/*
		// Crear estudiantes
		Estudiante estudiante1 = new Estudiante(12345678, 1001, "Juan", "Pérez", LocalDate.of(2000, 5, 15), true, "Buenos Aires");
		Estudiante estudiante2 = new Estudiante(87654321, 1002, "María", "González", LocalDate.of(1998, 8, 22), false, "Cordoba");
		Estudiante estudiante3 = new Estudiante(12345679, 1003, "Luis", "Fernández", LocalDate.of(1995, 12, 10), true, "Rosario");
		Estudiante estudiante4 = new Estudiante(98765432, 1004, "Ana", "Martínez", LocalDate.of(2001, 3, 5), false, "Mendoza");
		Estudiante estudiante5 = new Estudiante(11122233, 1005, "Carlos", "López", LocalDate.of(1999, 1, 25), true, "La Plata");
		Estudiante estudiante6 = new Estudiante(44455566, 1006, "Sofía", "Ramírez", LocalDate.of(2002, 7, 30), false, "Tucuman");
		Estudiante estudiante7 = new Estudiante(77788899, 1007, "Diego", "Torres", LocalDate.of(1996, 11, 20), true, "Salta");
		Estudiante estudiante8 = new Estudiante(22233344, 1008, "Lucía", "Morales", LocalDate.of(1997, 2, 14), false, "Rosario");
		Estudiante estudiante9 = new Estudiante(55566677, 1009, "Fernando", "Vargas", LocalDate.of(2003, 6, 1), true, "Santiago del Estero");
		Estudiante estudiante10 = new Estudiante(88899900, 1010, "Valentina", "Castro", LocalDate.of(1994, 9, 8), false, "Mendoza");

		estudianteDao.save(estudiante1);
		estudianteDao.save(estudiante2);
		estudianteDao.save(estudiante3);
		estudianteDao.save(estudiante4);
		estudianteDao.save(estudiante5);
		estudianteDao.save(estudiante6);
		estudianteDao.save(estudiante7);
		estudianteDao.save(estudiante8);
		estudianteDao.save(estudiante9);
		estudianteDao.save(estudiante10);

		// Crear carreras
		Carrera carrera1 = new Carrera(1, "Ingeniería en Sistemas");
		Carrera carrera2 = new Carrera(2, "Licenciatura en Administración");
		Carrera carrera3 = new Carrera(3, "Arquitectura");

		carreraDao.save(carrera1);
		carreraDao.save(carrera2);
		carreraDao.save(carrera3);

		// Crear y guardar instancias de Cursa sin repetir combinaciones de estudiante y carrera
		Cursa cursa1 = new Cursa(estudiante1, carrera1, LocalDate.of(2020, 2, 15), false);
		Cursa cursa2 = new Cursa(estudiante2, carrera2, LocalDate.of(2021, 3, 1), false);
		Cursa cursa3 = new Cursa(estudiante3, carrera3, LocalDate.of(2018, 8, 10), true);
		Cursa cursa4 = new Cursa(estudiante4, carrera1, LocalDate.of(2022, 5, 20), false);
		Cursa cursa5 = new Cursa(estudiante5, carrera2, LocalDate.of(2019, 9, 30), true);
		Cursa cursa6 = new Cursa(estudiante6, carrera1, LocalDate.of(2021, 11, 10), false);
		Cursa cursa7 = new Cursa(estudiante7, carrera3, LocalDate.of(2019, 10, 15), true);
		Cursa cursa8 = new Cursa(estudiante8, carrera2, LocalDate.of(2020, 6, 25), false);
		Cursa cursa9 = new Cursa(estudiante9, carrera1, LocalDate.of(2022, 8, 5), true);
		Cursa cursa10 = new Cursa(estudiante10, carrera3, LocalDate.of(2021, 12, 30), false);
		Cursa cursa11 = new Cursa(estudiante1, carrera2, LocalDate.of(2023, 1, 15), true);
		Cursa cursa12 = new Cursa(estudiante2, carrera3, LocalDate.of(2020, 2, 18), false);
		Cursa cursa13 = new Cursa(estudiante3, carrera1, LocalDate.of(2018, 7, 12), true);
		Cursa cursa14 = new Cursa(estudiante4, carrera2, LocalDate.of(2021, 3, 30), false);
		Cursa cursa15 = new Cursa(estudiante5, carrera3, LocalDate.of(2023, 4, 22), true);
		Cursa cursa16 = new Cursa(estudiante6, carrera2, LocalDate.of(2022, 9, 8), false);
		Cursa cursa17 = new Cursa(estudiante7, carrera1, LocalDate.of(2020, 5, 11), true);
		Cursa cursa18 = new Cursa(estudiante8, carrera3, LocalDate.of(2023, 8, 27), false);
		Cursa cursa19 = new Cursa(estudiante9, carrera2, LocalDate.of(2021, 4, 5), true);
		Cursa cursa20 = new Cursa(estudiante10, carrera1, LocalDate.of(2022, 11, 15), false);

		// Guardar las instancias de Cursa
		cursaDao.save(cursa1);
		cursaDao.save(cursa2);
		cursaDao.save(cursa3);
		cursaDao.save(cursa4);
		cursaDao.save(cursa5);
		cursaDao.save(cursa6);
		cursaDao.save(cursa7);
		cursaDao.save(cursa8);
		cursaDao.save(cursa9);
		cursaDao.save(cursa10);
		cursaDao.save(cursa11);
		cursaDao.save(cursa12);
		cursaDao.save(cursa13);
		cursaDao.save(cursa14);
		cursaDao.save(cursa15);
		cursaDao.save(cursa16);
		cursaDao.save(cursa17);
		cursaDao.save(cursa18);
		cursaDao.save(cursa19);
		cursaDao.save(cursa20);

		
		
*/

		
		
		
		
		
		//B5
		/* List<Estudiante> e = estudianteDao.findByGenero(true);
		 System.out.println("LOS DATOS SON:");
		 for (Estudiante estudiante : e) {
			System.out.println(estudiante);
		}*/
		 
		
		//B3
		/*
		 List<Estudiante> e = estudianteDao.findAll();
		 System.out.println("LOS DATOS SON:");
		 for (Estudiante estudiante : e) {
			System.out.println(estudiante);
		}*/
		
		//B4
		/*Estudiante e = estudianteDao.findByLibretaUniversitaria(1001);
		 System.out.println("El estudiante es:");
		System.out.println(e);*/
		
		//B6
		/*
		List<Object[]> resultados = cursaDao.findCarrerasConInscriptos();
		for (Object[] resultado : resultados) {
		    Carrera carrera = (Carrera) resultado[0];
		    Long cantidadInscriptos = (Long) resultado[1];
		    
		    // Aquí puedes trabajar con los datos, por ejemplo:
		    System.out.println("Carrera: " + carrera.getNombre() + ", Inscriptos: " + cantidadInscriptos);
		}*/
		
		
		//B7
		/*
		List<Object[]> resultados = cursaDao.findEstudianteCarreraYCiudad("Arquitectura", "Rosario");
		for (Object[] resultado : resultados) {
		    Estudiante e = (Estudiante) resultado[0];
		    String n = (String) resultado[1];
		    // Aquí puedes trabajar con los datos, por ejemplo:
		    System.out.println(e + " " +n);
		}*/
		
		//C)
		List<Object[]> resultados = cursaDao.findCarrerasConInscriptosYegresados();
		for (Object[] resultado : resultados) {
		    String nombreCarrera = (String) resultado[0];
		    int anioInscripcion = (int) resultado[1];
		    long cantidadInscriptos = (long) resultado[2]; // Contador de inscriptos
		    long cantidadEgresados = (long) resultado[3]; // Contador de egresados

		    // Aquí puedes trabajar con los datos, por ejemplo:
		    System.out.println("Carrera: " + nombreCarrera + ", Año: " + anioInscripcion +
		                       ", Inscriptos: " + cantidadInscriptos + 
		                       ", Egresados: " + cantidadEgresados);
		}

	

	}
}
