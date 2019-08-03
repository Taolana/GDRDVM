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
import model.ContainsMedocJointureModel;
import model.MedocModel;
import model.OrdersModel;

/**
 *
 * @author bynan
 */
public class MedocDao {

    public int insertMedicamentContainer(ContainsMedocJointureModel n) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "INSERT INTO `contains_medicaments_jointure`( `id_medoc`, `id_orders`) VALUES (?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, n.getId_medoc());
        ps.setInt(2, n.getId_orders());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        int id = 0;
        if (rs.next()) {
            id = rs.getInt(1);
        }
        return id;
    }

    public int insertMedicament(MedocModel n) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "INSERT INTO `medicaments`(`libel`, `type`, `dosage`, `duration`, `numbers`, `comment`) VALUES (?,?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setString(1, n.getLibel());
        ps.setString(2, n.getType());
        ps.setString(3, n.getDosage());
        ps.setString(4, n.getDuration());
        ps.setString(5, n.getNumbers());
        ps.setString(6, n.getComment());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        int id = 0;
        if (rs.next()) {
            id = rs.getInt(1);
        }
        return id;
    }
    
    public void updateOrdonnace(OrdersModel o) throws SQLException{
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "UPDATE `orders` SET `doctor_order`=? WHERE id =?";
        ps = con.prepareStatement(sql);
        ps.setString(1, o.getDoctor_order());
        ps.setInt(2, o.getId());
        ps.executeUpdate();
    }

    public void updateMedicament(MedocModel b) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "UPDATE `medicaments` SET `libel`=?,`type`=?,`dosage`=?,`duration`=?,`numbers`=?,`comment`=? WHERE id = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, b.getLibel());
        ps.setString(2, b.getType());
        ps.setString(3, b.getDosage());
        ps.setString(4, b.getDuration());
        ps.setString(5, b.getNumbers());
        ps.setString(6, b.getComment());
        ps.setInt(7, b.getId());
        ps.executeUpdate();
    }

    public MedocModel selectById(int idParam) throws SQLException {
        MedocModel medocModel = null;
        String sql = "SELECT * FROM `medicaments`  WHERE `id` = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String libel = rs.getString("libel");
            String type = rs.getString("type");
            String dosage = rs.getString("dosage");
            String duration = rs.getString("duration");
            String numbers = rs.getString("numbers");
            String comment = rs.getString("comment");

            medocModel = new MedocModel(id, libel, type, dosage, duration, numbers, comment);
        }
        return medocModel;
    }

    public List<ContainsMedocJointureModel> selectByIdOrder(int idOrder) throws SQLException {
        ContainsMedocJointureModel c = null;
        List containers = new ArrayList();
        String sql = "SELECT * FROM `contains_medicaments_jointure` WHERE id_orders =" + idOrder;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id_medoc = rs.getInt("id_medoc");
            int id_orders = rs.getInt("id_orders");
            c = new ContainsMedocJointureModel(id_medoc, id_orders);
            containers.add(c);
        }
        return containers;
    }
    
}
