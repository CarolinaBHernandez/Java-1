/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Carolina Hernández
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AutorServicio autorServicio = new AutorServicio();
        LibroServicio libroServicio = new LibroServicio();
        EditorialServicio editorialServicio = new EditorialServicio();
        ClienteServicio clienteServicio = new ClienteServicio();
        PrestamoServicio prestamoServicio = new PrestamoServicio();

        int opcion;
        int idCliente = 0;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1) Agregar un autor");
            System.out.println("2) Actualizar un autor");
            System.out.println("3) Eliminar un autor");
            System.out.println("4) Buscar un autor por ID");
            System.out.println("5) Listar todos los autores");
            System.out.println("6) Agregar una editorial");
            System.out.println("7) Actualizar una editorial");
            System.out.println("8) Eliminar una editorial");
            System.out.println("9) Buscar una editorial por ID");
            System.out.println("10) Buscar una editorial por nombre");
            System.out.println("11) Listar todas las editoriales");
            System.out.println("12) Agregar un libro");
            System.out.println("13) Actualizar un libro");
            System.out.println("14) Eliminar un libro");
            System.out.println("15) Buscar un libro por ISBN");
            System.out.println("16) Buscar un libro por título");
            System.out.println("17) Buscar libros por nombre de autor");
            System.out.println("18) Buscar libros por nombre de editorial");
            System.out.println("19) Listar todos los libros");
            System.out.println("20) Agregar un cliente");
            System.out.println("21) Registrar el préstamo de un libro");
            System.out.println("22) Devolver un libro");
            System.out.println("23)Listar prestamos de un cliente");
            System.out.println("0) Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar un autor");
                    System.out.print("Ingrese el nombre del autor: ");
                    String nombreAutor = leer.nextLine();

                    Autor autor = new Autor();
                    autor.setNombre(nombreAutor);
                    autor.setAlta(true);

                    autorServicio.guardarAutor(autor);

                    System.out.println("Autor agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Actualizar un autor");
                    System.out.println("Autores existentes:");

                    List<Autor> autoresExistentes = autorServicio.obtenerTodosAutores();
                    autoresExistentes.forEach((autorExistente) -> {
                        System.out.println("ID: " + autorExistente.getId() + ", Nombre: " + autorExistente.getNombre());
                    });

                    System.out.print("Ingrese el ID del autor que desea actualizar: ");
                    int idAutor = leer.nextInt();
                    leer.nextLine();

                    Autor autorExistente = autorServicio.buscarAutorPorId(idAutor);
                    if (autorExistente != null) {
                        System.out.print("Ingrese el nuevo nombre del autor: ");
                        String nuevoNombreAutor = leer.nextLine();

                        autorExistente.setNombre(nuevoNombreAutor);
                        autorServicio.actualizarAutor(autorExistente);

                        System.out.println("Autor actualizado correctamente.");
                    } else {
                        System.out.println("El autor no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Eliminar un autor");
                    System.out.println("Autores existentes:");

                    List<Autor> autoresExistentesEliminar = autorServicio.obtenerTodosAutores();
                    for (Autor autorEliminar : autoresExistentesEliminar) {
                        System.out.println("ID: " + autorEliminar.getId() + ", Nombre: " + autorEliminar.getNombre());
                    }

                    System.out.print("Ingrese el ID del autor que desea eliminar: ");
                    int idAutorEliminar = leer.nextInt();
                    leer.nextLine();

                    Autor autorAEliminar = autorServicio.buscarAutorPorId(idAutorEliminar);
                    if (autorAEliminar != null) {
                        autorServicio.eliminarAutor(autorAEliminar);
                        System.out.println("Autor eliminado correctamente.");
                    } else {
                        System.out.println("El autor no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Buscar un autor por ID");
                    System.out.print("Ingrese el ID del autor que desea buscar: ");
                    int idAutorBuscar = leer.nextInt();
                    leer.nextLine();

                    Autor autorEncontrado = autorServicio.buscarAutorPorId(idAutorBuscar);
                    if (autorEncontrado != null) {
                        System.out.println("Autor encontrado:");
                        System.out.println("ID: " + autorEncontrado.getId());
                        System.out.println("Nombre: " + autorEncontrado.getNombre());
                    } else {
                        System.out.println("El autor no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Listar todos los autores");

                    List<Autor> autoresList = autorServicio.obtenerTodosAutores();
                    if (autoresList.isEmpty()) {
                        System.out.println("No hay autores registrados.");
                    } else {
                        System.out.println("Autores registrados:");

                        for (Autor autorLista : autoresList) {
                            System.out.println("ID: " + autorLista.getId());
                            System.out.println("Nombre: " + autorLista.getNombre());
                            System.out.println("----------------------------");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Agregar una editorial");
                    System.out.print("Ingrese el nombre de la editorial: ");
                    String nombreEditorial = leer.nextLine();

                    Editorial editorial = new Editorial();
                    editorial.setNombre(nombreEditorial);
                    editorial.setAlta(true);

                    editorialServicio.guardarEditorial(editorial);

                    System.out.println("Editorial agregada correctamente.");
                    break;
                case 7:
                    System.out.println("Actualizar una editorial");

                    System.out.println("Editoriales existentes:");
                    List<Editorial> editorialesExistentes = editorialServicio.obtenerTodasEditoriales();
                    for (Editorial editorialExistente : editorialesExistentes) {
                        System.out.println("ID: " + editorialExistente.getId() + ", Nombre: " + editorialExistente.getNombre());
                    }

                    System.out.print("Ingrese el ID de la editorial que desea actualizar: ");
                    int idEditorial = leer.nextInt();
                    leer.nextLine();

                    Editorial editorialExistente = editorialServicio.buscarEditorial(idEditorial);
                    if (editorialExistente != null) {
                        System.out.print("Ingrese el nuevo nombre de la editorial: ");
                        String nuevoNombreEditorial = leer.nextLine();

                        editorialExistente.setNombre(nuevoNombreEditorial);
                        editorialServicio.actualizarEditorial(editorialExistente);

                        System.out.println("Editorial actualizada correctamente.");
                    } else {
                        System.out.println("La editorial no existe.");
                    }
                    break;

                case 8:
                    System.out.println("Eliminar una editorial");
                    System.out.println("Editoriales existentes:");

                    List<Editorial> editorialesExistentesEliminar = editorialServicio.obtenerTodasEditoriales();
                    for (Editorial editorialEliminar : editorialesExistentesEliminar) {
                        System.out.println("ID: " + editorialEliminar.getId() + ", Nombre: " + editorialEliminar.getNombre());
                    }

                    System.out.print("Ingrese el ID de la editorial que desea eliminar: ");
                    int idEditorialEliminar = leer.nextInt();
                    leer.nextLine();

                    Editorial editorialAEliminar = editorialServicio.buscarEditorial(idEditorialEliminar);
                    if (editorialAEliminar != null) {
                        editorialServicio.eliminarEditorial(editorialAEliminar);
                        System.out.println("Editorial eliminada correctamente.");
                    } else {
                        System.out.println("La editorial no existe.");
                    }
                    break;

                case 9:
                    System.out.println("Buscar una editorial por ID");
                    System.out.print("Ingrese el ID de la editorial que desea buscar: ");
                    int idEditorialBuscar = leer.nextInt();
                    leer.nextLine();

                    Editorial editorialEncontrada = editorialServicio.buscarEditorial(idEditorialBuscar);
                    if (editorialEncontrada != null) {
                        System.out.println("Editorial encontrada:");
                        System.out.println("ID: " + editorialEncontrada.getId());
                        System.out.println("Nombre: " + editorialEncontrada.getNombre());

                    } else {
                        System.out.println("La editorial no existe.");
                    }
                    break;
                case 10:
                    System.out.println("Buscar una editorial por nombre");
                    System.out.print("Ingrese el nombre de la editorial que desea buscar: ");
                    String nombreEditorialBuscar = leer.nextLine();

                    List<Editorial> editorialesEncontradas = editorialServicio.buscarEditorialPorNombre(nombreEditorialBuscar);
                    if (!editorialesEncontradas.isEmpty()) {
                        System.out.println("Editoriales encontradas:");
                        for (Editorial editorialBusqueda : editorialesEncontradas) {
                            System.out.println("ID: " + editorialBusqueda.getId());
                            System.out.println("Nombre: " + editorialBusqueda.getNombre());

                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("No se encontraron editoriales con ese nombre.");
                    }
                    break;
                case 11:
                    System.out.println("Listar todas las editoriales");

                    List<Editorial> editoriales = editorialServicio.obtenerTodasEditoriales();
                    if (editoriales.isEmpty()) {
                        System.out.println("No hay editoriales registradas.");
                    } else {
                        System.out.println("Editoriales registradas:");

                        for (Editorial editorialLista : editoriales) {
                            System.out.println("ID: " + editorialLista.getId());
                            System.out.println("Nombre: " + editorialLista.getNombre());

                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 12:
                    System.out.println("Agregar un libro");

                    System.out.print("Ingrese el ISBN del libro: ");
                    Long isbnLibro = leer.nextLong();
                    leer.nextLine();

                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = leer.nextLine();

                    System.out.print("Ingrese el autor del libro: ");
                    String nombreAutorLibro = leer.nextLine();
                    List<Autor> autoresLibro = autorServicio.buscarAutorPorNombre(nombreAutorLibro);

                    if (!autoresLibro.isEmpty()) {
                        System.out.print("Ingrese el año de publicación del libro: ");
                        int anioLibro = leer.nextInt();
                        leer.nextLine();

                        System.out.print("Ingrese el número de ejemplares del libro: ");
                        int ejemplaresLibro = leer.nextInt();
                        leer.nextLine();

                        System.out.print("Ingrese el nombre de la editorial del libro: ");
                        String nombreEditorialLibro = leer.nextLine();
                        List<Editorial> editorialesLibro = editorialServicio.buscarEditorialPorNombre(nombreEditorialLibro);
                        if (editorialesLibro.isEmpty()) {
                            System.out.println("La editorial no existe.");
                            break;
                        }

                        Editorial editorialLibro = editorialesLibro.get(0);

                        Libro libro = new Libro();
                        libro.setIsbn(isbnLibro);
                        libro.setTitulo(tituloLibro);
                        libro.setAutor(autoresLibro.get(0)); // Se utiliza el primer autor de la lista
                        libro.setAnio(anioLibro);
                        libro.setEjemplares(ejemplaresLibro);
                        libro.setEjemplaresPrestados(0);
                        libro.setEjemplaresRestantes(ejemplaresLibro);
                        libro.setEditorial(editorialLibro);

                        libroServicio.guardarLibro(libro);

                        System.out.println("Libro agregado correctamente.");
                    } else {
                        System.out.println("El autor no existe.");
                    }
                    break;

                case 13:
                    System.out.println("Editar un libro");

                    System.out.println("Libros existentes:");
                    List<Libro> librosExistentes = libroServicio.obtenerTodosLibros();
                    for (Libro libroExistente : librosExistentes) {
                        System.out.println("ISBN: " + libroExistente.getIsbn() + ", Título: " + libroExistente.getTitulo());
                    }

                    System.out.print("Ingrese el ISBN del libro que desea actualizar: ");
                    Long isbnLibroActualizar = leer.nextLong();
                    leer.nextLine();

                    Libro libroActualizar = libroServicio.buscarLibroPorISBN(isbnLibroActualizar);
                    if (libroActualizar == null) {
                        System.out.println("El libro no existe.");
                        break;
                    }

                    System.out.print("Ingrese el nuevo ISBN del libro: ");
                    Long nuevoIsbnLibro = leer.nextLong();
                    leer.nextLine();

                    Libro libroExistente = libroServicio.buscarLibroPorISBN(nuevoIsbnLibro);
                    if (libroExistente != null && !libroExistente.equals(libroActualizar)) {
                        System.out.println("El nuevo ISBN ya está asociado a otro libro.");
                        break;
                    }

                    System.out.print("Ingrese el nuevo título del libro: ");
                    String nuevoTituloLibro = leer.nextLine();

                    System.out.print("Ingrese el nuevo autor del libro: ");
                    String nuevoAutorLibro = leer.nextLine();

                    List<Autor> autoresNuevoLibro = autorServicio.buscarAutorPorNombre(nuevoAutorLibro);

                    if (!autoresNuevoLibro.isEmpty()) {
                        Autor nuevoAutor = autoresNuevoLibro.get(0);

                        System.out.print("Ingrese el nuevo año de publicación del libro: ");
                        int nuevoAnioLibro = leer.nextInt();
                        leer.nextLine();

                        System.out.print("Ingrese el nuevo número de ejemplares del libro: ");
                        int nuevoEjemplaresLibro = leer.nextInt();
                        leer.nextLine();

                        System.out.print("Ingrese el nuevo nombre de la editorial del libro: ");
                        String nuevaEditorialLibro = leer.nextLine();

                        List<Editorial> editorialesActualizadas = editorialServicio.buscarEditorialPorNombre(nuevaEditorialLibro);
                        if (editorialesActualizadas.isEmpty()) {
                            System.out.println("La editorial no existe.");
                            break;
                        }
                        Editorial nuevaEditorial = editorialesActualizadas.get(0);

                        libroActualizar.setIsbn(nuevoIsbnLibro);
                        libroActualizar.setTitulo(nuevoTituloLibro);
                        libroActualizar.setAutor(nuevoAutor);
                        libroActualizar.setAnio(nuevoAnioLibro);
                        libroActualizar.setEjemplares(nuevoEjemplaresLibro);
                        libroActualizar.setEditorial(nuevaEditorial);

                        libroServicio.editarLibro(libroActualizar);

                        System.out.println("Libro actualizado correctamente.");
                    } else {
                        System.out.println("El autor no existe.");
                    }
                    break;

                case 14:
                    System.out.println("Eliminar un libro");

                    System.out.println("Libros existentes:");
                    List<Libro> librosExistentesEliminar = libroServicio.obtenerTodosLibros();
                    for (Libro libroEliminar : librosExistentesEliminar) {
                        System.out.println("ISBN: " + libroEliminar.getIsbn() + ", Título: " + libroEliminar.getTitulo());
                    }

                    System.out.print("Ingrese el ISBN del libro que desea eliminar: ");
                    Long isbnLibroEliminar = leer.nextLong();
                    leer.nextLine();

                    Libro libroAEliminar = libroServicio.buscarLibroPorISBN(isbnLibroEliminar);
                    if (libroAEliminar != null) {
                        libroServicio.eliminarLibro(isbnLibroEliminar);
                        System.out.println("Libro eliminado correctamente.");
                    } else {
                        System.out.println("El libro no existe.");
                    }
                    break;

                case 15:
                    System.out.println("Buscar un libro por ISBN");
                    System.out.print("Ingrese el ISBN del libro que desea buscar: ");
                    Long isbnBuscar = leer.nextLong();
                    leer.nextLine();

                    Libro libroEncontrado = libroServicio.buscarLibroPorISBN(isbnBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println("ISBN: " + libroEncontrado.getIsbn());
                        System.out.println("Título: " + libroEncontrado.getTitulo());
                        // Mostrar otros detalles del libro
                    } else {
                        System.out.println("El libro no existe.");
                    }
                    break;

                case 16:
                    System.out.println("Buscar un libro por título");
                    System.out.print("Ingrese el título del libro que desea buscar: ");
                    String tituloBuscar = leer.nextLine();

                    List<Libro> librosEncontrados = libroServicio.buscarLibroPorTitulo(tituloBuscar);
                    if (!librosEncontrados.isEmpty()) {
                        System.out.println("Libros encontrados:");
                        for (Libro libro : librosEncontrados) {
                            System.out.println("ISBN: " + libro.getIsbn());
                            System.out.println("Título: " + libro.getTitulo());
                            System.out.println("Año: " + libro.getAnio());
                            System.out.println("Ejemplares: " + libro.getEjemplares());
                            System.out.println("Ejemplares prestados: " + libro.getEjemplaresPrestados());
                            System.out.println("Ejemplares restantes: " + libro.getEjemplaresRestantes());
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("No se encontraron libros con ese título.");
                    }
                    break;

                case 17:
                    System.out.println("Buscar libros por nombre de autor");
                    System.out.print("Ingrese el nombre del autor: ");
                    String nombreAutorBuscar = "nombreAutor";
                    List<Libro> resultadosBusqueda = libroServicio.buscarLibrosPorNombreAutor(nombreAutorBuscar);

                    if (!resultadosBusqueda.isEmpty()) {
                        System.out.println("Libros encontrados:");
                        for (Libro libro : resultadosBusqueda) {
                            System.out.println("ISBN: " + libro.getIsbn());
                            System.out.println("Título: " + libro.getTitulo());
                            System.out.println("Año: " + libro.getAnio());
                            System.out.println("Ejemplares: " + libro.getEjemplares());
                            System.out.println("Ejemplares prestados: " + libro.getEjemplaresPrestados());
                            System.out.println("Ejemplares restantes: " + libro.getEjemplaresRestantes());
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("No se encontraron libros para ese autor.");
                    }
                    break;

                case 18:
                    System.out.println("Buscar libros por nombre de editorial");
                    System.out.print("Ingrese el nombre de la editorial: ");
                    String nombreEditorialBuscadas = leer.nextLine();

                    List<Libro> librosPorEditorial = libroServicio.buscarLibrosPorEditorial(nombreEditorialBuscadas);

                    if (librosPorEditorial.isEmpty()) {
                        System.out.println("No se encontraron libros de la editorial: " + nombreEditorialBuscadas);
                    } else {
                        System.out.println("Libros encontrados de la editorial: " + nombreEditorialBuscadas);
                        for (Libro libroPorEditorial : librosPorEditorial) {
                            System.out.println("ISBN: " + libroPorEditorial.getIsbn() + ", Título: " + libroPorEditorial.getTitulo());
                        }
                    }
                    break;

                case 19:
                    System.out.println("Listado de todos los libros:");
                    List<Libro> libros = libroServicio.obtenerTodosLibros();
                    for (Libro libro : libros) {
                        System.out.println("Título: " + libro.getTitulo());
                        System.out.println("ISBN: " + libro.getIsbn());
                        System.out.println("Autor: " + libro.getAutor().getNombre());
                        System.out.println("--------------------");
                    }
                    break;
                case 20:
                    System.out.println("Crear un nuevo cliente");
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = leer.nextLine();

                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellidoCliente = leer.nextLine();

                    System.out.print("Ingrese el número de documento del cliente: ");
                    Long documentoCliente = leer.nextLong();
                    leer.nextLine();

                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefonoCliente = leer.nextLine();

                    Cliente cliente = new Cliente();
                    cliente.setNombre(nombreCliente);
                    cliente.setApellido(apellidoCliente);
                    cliente.setDocumento(documentoCliente);
                    cliente.setTelefono(telefonoCliente);

                    clienteServicio.guardarCliente(cliente);

                    System.out.println("Cliente creado correctamente.");
                    break;

                case 21:
                    System.out.println("Registrar préstamo de un libro");

                    System.out.print("Ingrese el ID del cliente: ");
                    idCliente = leer.nextInt();
                    leer.nextLine();

                    Cliente clientePrestamo = clienteServicio.buscarClientePorId(idCliente);

                    if (clientePrestamo == null) {
                        System.out.println("El cliente no existe.");
                    } else {

                        Prestamo prestamo = new Prestamo();
                        prestamo.setCliente(clientePrestamo);
                        prestamo.setLibro(new Libro());

                        System.out.print("Ingrese el ISBN del libro: ");
                        isbnLibro = leer.nextLong();
                        leer.nextLine();

                        Libro libroPrestamo = libroServicio.buscarLibroPorISBN(isbnLibro);

                        if (libroPrestamo == null) {
                            System.out.println("El libro no existe.");
                        } else if (libroPrestamo.getEjemplaresRestantes() <= 0) {
                            System.out.println("No hay ejemplares disponibles de ese libro.");
                        } else {

                            prestamo.setLibro(libroPrestamo);
                            prestamo.setFechaPrestamo(new Date());
                            prestamoServicio.guardarPrestamo(prestamo);

                            libroPrestamo.setEjemplaresPrestados(libroPrestamo.getEjemplaresPrestados() + 1);
                            libroPrestamo.setEjemplaresRestantes(libroPrestamo.getEjemplaresRestantes() - 1);
                            libroServicio.actualizarLibro(libroPrestamo);

                            System.out.println("Préstamo registrado correctamente.");
                        }
                    }
                    break;

                case 22:
                    System.out.println("Devolución de un libro");

                    System.out.print("Ingrese el ID del préstamo: ");
                    int idPrestamo = leer.nextInt();
                    leer.nextLine();

                    Prestamo prestamo = prestamoServicio.buscarPrestamoPorId(idPrestamo);
                    if (prestamo != null) {
                        if (prestamo.getFechaDevolucion() != null) {
                            System.out.println("El préstamo ya ha sido devuelto.");
                        } else {
                            prestamo.setFechaDevolucion(new Date());
                            prestamoServicio.actualizarPrestamo(prestamo);

                            Libro libroPrestado = prestamo.getLibro();
                            libroPrestado.setEjemplaresPrestados(libroPrestado.getEjemplaresPrestados() - 1);
                            libroPrestado.setEjemplaresRestantes(libroPrestado.getEjemplaresRestantes() + 1);
                            libroServicio.actualizarLibro(libroPrestado);

                            System.out.println("Devolución realizada correctamente.");
                        }
                    } else {
                        System.out.println("El préstamo no existe.");
                    }
                    break;
                case 23:
                    System.out.println("Búsqueda de todos los préstamos de un Cliente.");

                    Cliente clientePrestamos = clienteServicio.buscarClientePorId(idCliente);
                    if (clientePrestamos != null) {
                        List<Prestamo> prestamosCliente = (List<Prestamo>) prestamoServicio.listarPrestamoPorId(idCliente);

                        if (!prestamosCliente.isEmpty()) {
                            System.out.println("Préstamos del Cliente con ID " + idCliente + ":");
                            for (Prestamo prestamoLibro : prestamosCliente) {

                                System.out.println("ID: " + prestamoLibro.getId());
                                System.out.println("Fecha Préstamo: " + prestamoLibro.getFechaPrestamo());
                                System.out.println("Fecha Devolución: " + prestamoLibro.getFechaDevolucion());
                                System.out.println("Cliente: " + prestamoLibro.getCliente().getNombre());
                                System.out.println("Libro: " + prestamoLibro.getLibro().getTitulo());
                                System.out.println("--------------------");
                            }
                        } else {
                            System.out.println("No se encontraron préstamos para el Cliente con ID " + idCliente + ".");
                        }
                    } else {
                        System.out.println("El cliente no existe.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);
    }
}
