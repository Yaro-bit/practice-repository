package demo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class KundenDatenbank {
	private static final String URL = "jdbc:derby:KundenDB;create=true"; // URL für die Derby-Datenbank
	private static final String USER = "";
	private static final String PASSWORD = "";

	// Verbindung zur Derby-Datenbank
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
/*
	// Create (Kunde hinzufügen)
	public static void addKunde(String vorname, String nachname, String email) {
		String query = "INSERT INTO Kunden (vorname, nachname, email) VALUES (?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, vorname);
			stmt.setString(2, nachname);
			stmt.setString(3, email);
			stmt.executeUpdate();
			System.out.println("Kunde hinzugefügt: " + vorname + " " + nachname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Read (Kunden anzeigen)
	public static void getAllKunden() {
		String query = "SELECT * FROM Kunden";
		try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String vorname = rs.getString("vorname");
				String nachname = rs.getString("nachname");
				String email = rs.getString("email");
				System.out.println(
						"ID: " + id + ", Vorname: " + vorname + ", Nachname: " + nachname + ", E-Mail: " + email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Update (Kundendaten aktualisieren)
	public static void updateKunde(int id, String neuerVorname, String neuerNachname, String neueEmail) {
		String query = "UPDATE Kunden SET vorname = ?, nachname = ?, email = ? WHERE id = ?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, neuerVorname);
			stmt.setString(2, neuerNachname);
			stmt.setString(3, neueEmail);
			stmt.setInt(4, id);
			stmt.executeUpdate();
			System.out.println("Kunde mit ID " + id + " wurde aktualisiert.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Delete (Kunde löschen)
	public static void deleteKunde(int id) {
		String query = "DELETE FROM Kunden WHERE id = ?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Kunde mit ID " + id + " wurde gelöscht.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
*/
	public static void main(String[] args) {
		try {
			// Verbindung prüfen
			Connection conn = getConnection();
			System.out.println("Verbindung zur Datenbank erfolgreich!");
			
			conn.close();
			conn = null;
			
	/*		// Kunden hinzufügen
			addKunde("Max", "Mustermann", "max@mustermann.de");
			addKunde("Erika", "Musterfrau", "erika@musterfrau.de");

			// Alle Kunden anzeigen
			getAllKunden();

			// Kunden aktualisieren
			updateKunde(1, "Maximilian", "Mustermann", "maxi@mustermann.de");

			// Kunden nach dem Update anzeigen
			getAllKunden();

			// Kunden löschen
			deleteKunde(2);

			// Alle Kunden nach Löschung anzeigen
			getAllKunden();
*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
