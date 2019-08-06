/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ComposeOrderJointureModel;
import model.OrdersModel;

/**
 *
 * @author bynan
 */
public class OrdersDao {

    /**
     * return a last inserted id
     *
     * @param n
     * @return
     * @throws SQLException
     */
    public int insertOrder(OrdersModel n) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "INSERT INTO `orders`(`doctor_order`) VALUES (?)";
        ps = con.prepareStatement(sql);
        ps.setString(1, n.getDoctor_order());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        int id = 0;
        if (rs.next()) {
            id = rs.getInt(1);
        }
        return id;
    }

    public int insertJointureComposeOrder(ComposeOrderJointureModel c) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "INSERT INTO `compose_an_order_jointure`( `user_id`, `order_id`, `medical_folder_id`, `appointment_id`, `timestamp`) VALUES (?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, c.getUser_id());
        ps.setInt(2, c.getOrder_id());
        ps.setInt(3, c.getMedical_folder_id());
        ps.setInt(4, c.getAppointment_id());
        ps.setString(5, c.getTs());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        int id = 0;
        if (rs.next()) {
            id = rs.getInt(1);
        }
        return id;
    }

    public ComposeOrderJointureModel selectByIdOrder(int id_order) throws SQLException {
        ComposeOrderJointureModel c = null;
        String sql = "SELECT * FROM `compose_an_order_jointure` WHERE order_id = " + id_order;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            int user_id = rs.getInt("user_id");
            int order_id = rs.getInt("order_id");
            int medical_folder_id = rs.getInt("medical_folder_id");
            int appointment_id = rs.getInt("appointment_id");
            String ts = rs.getString("timestamp");
            c = new ComposeOrderJointureModel(id, user_id, order_id, medical_folder_id, appointment_id, ts);
        }
        return c;
    }
    public List<ComposeOrderJointureModel> selectByMedicFolderID(int p) throws SQLException {
        ComposeOrderJointureModel c = null;
        List containers = new ArrayList();
        String sql = "SELECT * FROM `compose_an_order_jointure` WHERE medical_folder_id = " + p;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            int user_id = rs.getInt("user_id");
            int order_id = rs.getInt("order_id");
            int medical_folder_id = rs.getInt("medical_folder_id");
            int appointment_id = rs.getInt("appointment_id");
            String ts = rs.getString("timestamp");
            c = new ComposeOrderJointureModel(id, user_id, order_id, medical_folder_id,appointment_id, ts);
            containers.add(c);
        }
        return containers;
    }

    public OrdersModel selectById(int idParam) throws SQLException {
        OrdersModel orderModel = null;
        String sql = "SELECT * FROM `orders` WHERE `id` = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String doctor_order = rs.getString("doctor_order");

            orderModel = new OrdersModel(id, doctor_order);
        }
        return orderModel;
    }
    
    public OrdersModel selectLastInsertedOrder() throws SQLException{
        OrdersModel orderModel = null;
        String sql = "SELECT * FROM `orders` ORDER by id DESC";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        if (rs.first()) {
            int id = Integer.parseInt(rs.getString("id"));
            String doctor_order = rs.getString("doctor_order");

             return orderModel = new OrdersModel(id, doctor_order);
             
        }else{
            return null;
        }
    }
    
    
}
