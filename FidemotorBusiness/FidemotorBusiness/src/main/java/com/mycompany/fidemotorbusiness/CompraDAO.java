/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidemotorbusiness;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ferna
 */
public class CompraDAO {


    private static final String SELECT_ALL_QUERY = "SELECT * FROM compras";
    private static final String INSERT_QUERY = "INSERT INTO compras (cliente_id, vehiculo_id, estado) VALUES (?, ?, ?)";
    private static final String UPDATE_ESTADO_QUERY = "UPDATE compras SET estado = ? WHERE id = ?";
    
    public List<CompraDAO> getAllCompras() {
        List<CompraDAO> compras = new ArrayList<>();
        try (Connection connection = DBManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SELECT_ALL_QUERY);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int clienteId = resultSet.getInt("cliente_id");
                int vehiculoId = resultSet.getInt("vehiculo_id");
                String estado = resultSet.getString("estado");
                CompraDAO compra = new Compra(id, clienteId, vehiculoId, estado);
                compras.add(compra);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return compras;
    }

    public void addCompra(int clienteId, int vehiculoId, String estado) {
        try (Connection connection = DBManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_QUERY)) {
            statement.setInt(1, clienteId);
            statement.setInt(2, vehiculoId);
            statement.setString(3, estado);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEstado(int compraId, String estado) {
        try (Connection connection = DBManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_ESTADO_QUERY)) {
            statement.setString(1, estado);
            statement.setInt(2, compraId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

