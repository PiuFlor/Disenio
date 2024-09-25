package Disenio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Obtener la f�brica (Singleton)
		JPADAOFactory daoFactory = JPADAOFactory.getInstance();

		// Obtener DAOS
		EstudianteDAO estudianteDao = daoFactory.createEstudianteDAO();
		CarreraDAO carreraDao = daoFactory.createCarreraDAO();
		CursaDAO cursaDao = daoFactory.createCursoDAO();
		/*
		// Crear estudiantes
		Estudiante estudiante1 = new Estudiante(12345678, 1001, "Juan", "P�rez", LocalDate.of(2000, 5, 15), true, "Buenos Aires");
		Estudiante estudiante2 = new Estudiante(87654321, 1002, "Mar�a", "Gonz�lez", LocalDate.of(1998, 8, 22), false, "Cordoba");
		Estudiante estudiante3 = new Estudiante(12345679, 1003, "Luis", "Fern�ndez", LocalDate.of(1995, 12, 10), true, "Rosario");
		Estudiante estudiante4 = new Estudiante(98765432, 1004, "Ana", "Mart�nez", LocalDate.of(2001, 3, 5), false, "Mendoza");
		Estudiante estudiante5 = new Estudiante(11122233, 1005, "Carlos", "L�pez", LocalDate.of(1999, 1, 25), true, "La Plata");
		Estudiante estudiante6 = new Estudiante(44455566, 1006, "Sof�a", "Ram�rez", LocalDate.of(2002, 7, 30), false, "Tucuman");
		Estudiante estudiante7 = new Estudiante(77788899, 1007, "Diego", "Torres", LocalDate.of(1996, 11, 20), true, "Salta");
		Estudiante estudiante8 = new Estudiante(22233344, 1008, "Luc�a", "Morales", LocalDate.of(1997, 2, 14), false, "Rosario");
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
		Carrera carrera1 = new Carrera(1, "Ingenier�a en Sistemas");
		Carrera carrera2 = new Carrera(2, "Licenciatura en Administraci�n");
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
		
		//genero la lista de estudiantes
		List<Estudiante> est = generarEstudiantes();
		
		//verifico que los estudiantes no se encuentren en la base de datos
		for (Estudiante estudiante : est) {
			if (estudianteDao.findById(estudiante.getDni()) == null) {
		        estudianteDao.save(estudiante);
		    }
		}
		
		//genero la lista de carreras
		List<Carrera> c = generarCarreras();
		
		//verifico que las carreras no se encuentren en la base de datos, en caso de no estar las agrega
		for (Carrera carrera : c) {
			if (carreraDao.findById(carrera.getIdCarrera()) == null) {
		        carreraDao.save(carrera);
		    }
		}
		
		//genero las relaciones cursa
		List<Cursa> cu = generarCursa(est, c);
		
		//verifico que los cursa no existan en la base de datos, en caso de no existir los agrega
		for (Cursa cursa : cu) {
			CursaId id = new CursaId(cursa.getEstudiante().getDni(), cursa.getCarrera().getIdCarrera());
			if (cursaDao.findById(id) == null) {
		        cursaDao.save(cursa);
		    }
		}
		
		//Respuestas a Los servicios:
		
		//B)1) dar de alta un estudiante
		
		/*
		   Como ejemplo:
		   Estudiante estudiante1 = new Estudiante(12345678, 1001, "Juan", "P�rez", LocalDate.of(2000, 5, 15), true, "Buenos Aires");
		   estudianteDao.save(estudiante1);
		 */
		
		//B)2) matricular un estudiante en una carrera
		/*
		 	Como ejemplo:
		 	Carrera carrera1 = new Carrera(1, "Ingenier�a en Sistemas");
		 	carreraDao.save(carrera1);
		 	Cursa cursa1 = new Cursa(estudiante1, carrera1, LocalDate.of(2020, 2, 15), false);
		 	cursaDao.save(cursa1);
		 */
		
		//B)3)recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple.
		
			List<Estudiante> e3 = estudianteDao.findAll();
			System.out.println("Ejercicio B)3) recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple:");
			for (Estudiante estudiante : e3) {
				System.out.println(estudiante);
			}
		
		System.out.println("");
		System.out.println("");
		
		//B)4) recuperar un estudiante, en base a su número de libreta universitaria.
			
			Estudiante e4 = estudianteDao.findByLibretaUniversitaria(1001);
			System.out.println("Ejercicio B)4) recuperar un estudiante, en base a su número de libreta universitaria:");
			System.out.println(e4);
			
		
		System.out.println("");
		System.out.println("");
		
		//B)5) recuperar todos los estudiantes, en base a su género.
		 
			List<Estudiante> e5 = estudianteDao.findByGenero(true);
			System.out.println("Ejercicio B)5) recuperar todos los estudiantes, en base a su género:");
			for (Estudiante estudiante : e5) {
				System.out.println(estudiante);
			}
		
		 
		System.out.println("");
		System.out.println("");		
		
		//B)6) recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
		
			List<Object[]> resultados6 = cursaDao.findCarrerasConInscriptos();
			System.out.println("Ejercicio B)6) recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos:");
			for (Object[] resultado : resultados6) {
		    	Carrera carrera = (Carrera) resultado[0];
		    	Long cantidadInscriptos = (Long) resultado[1];
		    	System.out.println("Carrera: " + carrera.getNombre() + ", Inscriptos: " + cantidadInscriptos);
			}
		
		
		System.out.println("");
		System.out.println("");
		
		//B)7) recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia.
		
			List<Object[]> resultados7 = cursaDao.findEstudianteCarreraYCiudad("Arquitectura", "Rosario");
			System.out.println("Ejercicio B)6) recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia: ");
			for (Object[] resultado : resultados7) {
		    	Estudiante e = (Estudiante) resultado[0];
		    	String n = (String) resultado[1];
		    	System.out.println(e + " " +n);
			}
		
		
		System.out.println("");
		System.out.println("");
		
		//C) Generar un reporte de las carreras, que para cada carrera incluya información de los
		//inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y
		//presentar los años de manera cronológica.
		
			List<Object[]> resultadosC = cursaDao.findCarrerasConInscriptosYegresados();
			System.out.println("Ejercicio C) Generar un reporte de las carreras, que para cada carrera incluya información de los inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y presentar los años de manera cronológica:");
			for (Object[] resultado : resultadosC) {
				String nombreCarrera = (String) resultado[0];
				int anioInscripcion = (int) resultado[1];
				long cantidadInscriptos = (long) resultado[2];
				long cantidadEgresados = (long) resultado[3];
				System.out.println("Carrera: " + nombreCarrera + ", A�o: " + anioInscripcion +
		                       ", Inscriptos: " + cantidadInscriptos + 
		                       ", Egresados: " + cantidadEgresados);
			}
	}
	
	private static List<Estudiante> generarEstudiantes(){
		List<Estudiante> e = new ArrayList<>();
		Estudiante estudiante1 = new Estudiante(12345678, 1001, "Juan", "P�rez", LocalDate.of(2000, 5, 15), true, "Buenos Aires");
		e.add(estudiante1);
		Estudiante estudiante2 = new Estudiante(87654321, 1002, "Mar�a", "Gonz�lez", LocalDate.of(1998, 8, 22), false, "Cordoba");
		e.add(estudiante2);
		Estudiante estudiante3 = new Estudiante(12345679, 1003, "Luis", "Fern�ndez", LocalDate.of(1995, 12, 10), true, "Rosario");
		e.add(estudiante3);
		Estudiante estudiante4 = new Estudiante(98765432, 1004, "Ana", "Mart�nez", LocalDate.of(2001, 3, 5), false, "Mendoza");
		e.add(estudiante4);
		Estudiante estudiante5 = new Estudiante(11122233, 1005, "Carlos", "L�pez", LocalDate.of(1999, 1, 25), true, "La Plata");
		e.add(estudiante5);
		Estudiante estudiante6 = new Estudiante(44455566, 1006, "Sof�a", "Ram�rez", LocalDate.of(2002, 7, 30), false, "Tucuman");
		e.add(estudiante6);
		Estudiante estudiante7 = new Estudiante(77788899, 1007, "Diego", "Torres", LocalDate.of(1996, 11, 20), true, "Salta");
		e.add(estudiante7);
		Estudiante estudiante8 = new Estudiante(22233344, 1008, "Luc�a", "Morales", LocalDate.of(1997, 2, 14), false, "Rosario");
		e.add(estudiante8);
		Estudiante estudiante9 = new Estudiante(55566677, 1009, "Fernando", "Vargas", LocalDate.of(2003, 6, 1), true, "Santiago del Estero");
		e.add(estudiante9);
		Estudiante estudiante10 = new Estudiante(88899900, 1010, "Valentina", "Castro", LocalDate.of(1994, 9, 8), false, "Mendoza");
		e.add(estudiante10);
		return e;
	}
	
	private static List<Carrera> generarCarreras(){
		List<Carrera> c = new ArrayList<>();
		Carrera carrera1 = new Carrera(1, "Ingenier�a en Sistemas");
		c.add(carrera1);
		Carrera carrera2 = new Carrera(2, "Licenciatura en Administraci�n");
		c.add(carrera2);
		Carrera carrera3 = new Carrera(3, "Arquitectura");
		c.add(carrera3);
		return c;
	}
	
	private static List<Cursa> generarCursa(List<Estudiante> e, List<Carrera> c) {
	    List<Cursa> cursas = new ArrayList<>();
	    if (e.size() == 10 && c.size() == 3) {
	        cursas.add(new Cursa(e.get(0), c.get(0), LocalDate.of(2020, 2, 15), false));
	        cursas.add(new Cursa(e.get(1), c.get(1), LocalDate.of(2021, 3, 1), false));
	        cursas.add(new Cursa(e.get(2), c.get(2), LocalDate.of(2018, 8, 10), true));
	        cursas.add(new Cursa(e.get(3), c.get(0), LocalDate.of(2022, 5, 20), false));
	        cursas.add(new Cursa(e.get(4), c.get(1), LocalDate.of(2019, 9, 30), true));
	        cursas.add(new Cursa(e.get(5), c.get(0), LocalDate.of(2021, 11, 10), false));
	        cursas.add(new Cursa(e.get(6), c.get(2), LocalDate.of(2019, 10, 15), true));
	        cursas.add(new Cursa(e.get(7), c.get(1), LocalDate.of(2020, 6, 25), false));
	        cursas.add(new Cursa(e.get(8), c.get(0), LocalDate.of(2022, 8, 5), true));
	        cursas.add(new Cursa(e.get(9), c.get(2), LocalDate.of(2021, 12, 30), false));
	    }
	    return cursas;
	}
}
