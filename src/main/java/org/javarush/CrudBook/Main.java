//package org.javarush.CrudBook;
//
//import com.mysql.fabric.jdbc.FabricMySQLDriver;
//
//import java.io.*;
//import java.sql.*;
//
//import com.ibatis.common.jdbc.ScriptRunner;
//
//public class Main {
//     private static final String URL = "jdbc:mysql://localhost:3306/sql_books";
//     private static final String USERNAME = "root";
//     private static final String PASSWORD = "Phmo_mmg03icGD";
//
//    public static void main(String[] args) {
//        Connection connection;
//        String s = new String();
//        StringBuffer sb = new StringBuffer();
//
//        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            Statement statement = connection.createStatement();
//
//            try {
//                // Initialize object for ScripRunner
//                ScriptRunner sr = new ScriptRunner(connection, false, false);
//
//                // Give the input file to Reader
//                Reader reader = new BufferedReader(
//                        new FileReader("C:\\Users\\blaec\\Google Drive\\Java\\javaRush\\BooksCrud\\src\\main\\resources\\scriptForDB.sql"));
//
//                // Exctute script
//                sr.runScript(reader);
//
//            } catch (Exception e) {
//                System.err.println("Failed to Execute" + "C:\\Users\\blaec\\Google Drive\\Java\\javaRush\\BooksCrud\\src\\main\\resources\\scriptForDB.sql"
//                        + " The error is " + e.getMessage());
//            }
//
//            if (!connection.isClosed()) {
//                System.out.println("Connection established");
//            }
//            connection.close();
//        } catch (Exception e) {
//            System.err.println("Failed to load the driver class!");
//        }
//    }
//}
