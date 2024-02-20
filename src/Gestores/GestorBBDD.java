package Gestores;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.mysql.cj.xdevapi.Result;

import Clases.Libro;
import Clases.Prestamos;
import Clases.Socio;
import Conector.Conectar;

public class GestorBBDD extends Conectar {

	public void insertarLibro (Libro libro) {

			
				// Ejecutar query para habitat
		

				String sql = "INSERT INTO libros (titulo, autor, num_pag) VALUES ( ?, ?, ?)";
				try {
					PreparedStatement pst = cn.prepareStatement(sql);
					pst.setString(1, libro.getTitulo_Libro());
					pst.setString(2, libro.getAutor_Libro());
					pst.setInt(3, libro.getNum_pag());
					
					pst.execute();
				System.out.println("Insert completado");
				
				} 	
					catch (SQLException e) {
					System.out.println("Error en la Query");
					e.printStackTrace();
				}
		}
	public void eliminarLibro (int id) {

		String sql = "DELETE FROM libros WHERE id = ?";
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			
			pst.execute();
		System.out.println("Libro eliminado");
		
		} 	
			catch (SQLException e) {
			System.out.println("Error en la Query");
			e.printStackTrace();
		}
	}
	public void modificarLibro (Libro libro,int id) {
		String sql = "UPDATE FROM libros WHERE id = ?";
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, libro.getTitulo_Libro());
			pst.setString(2, libro.getAutor_Libro());
			pst.setInt(3, libro.getNum_pag());
			
			pst.setInt(4, id);
			
			pst.execute();
		System.out.println("Libro modificado" + libro );
		
		} 	
			catch (SQLException e) {
			System.out.println("Error en la Query");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Libro> obtenerLibros() {
		ArrayList<Libro> libros = new ArrayList<>();
		
		String sql ="SELECT * FROM libros";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
					Libro l = new Libro();
					l.setId_libro(rs.getInt("id"));
					l.setTitulo_Libro(rs.getString("titulo"));
					l.setAutor_Libro(rs.getString("autor"));
					l.setNum_pag(rs.getInt("num_pag"));
					
					libros.add(l);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libros;
	}
	
	public void buscarPorTitulo(String titulo) {
		String sql ="SELECT * FROM libros WHERE titulo = (?)";
		Libro libros = new Libro();
		
			try {
				PreparedStatement pst = cn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					Libro l = new Libro();
					l.setId_libro(rs.getInt("id"));
					l.setTitulo_Libro(rs.getString("titulo"));
					l.setAutor_Libro(rs.getString("autor"));
					l.setNum_pag(rs.getInt("num_pag"));

				}
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return libros;
		}
	
	public void obtenerLibro() {
		
	}
	
	public void insertarPrestamo(Prestamos prestamo, Libro idLibro, Socio idSocio ) {

		String sql = "INSERT INTO prestamos (id_libro, id_socio, fecha, devuelto) VALUES ( ?, ?, ?, ?)";
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, prestamo.getId_libro().getId_libro());
			pst.setInt(2, prestamo.getId_socio().getId_socio());
			pst.setDate(3, prestamo.getFecha());
			pst.setBoolean(4,prestamo.getDevuelto());
			
			pst.execute();
		System.out.println("Insert completado");
		
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
  }
}


