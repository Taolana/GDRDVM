/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CrenelModel;

/**
 *
 * @author bynan
 */
public class CrenelDao {
    public List<CrenelModel> crenels() throws SQLException{
        CrenelModel crenelModel = null;
        List crenelsOf = new ArrayList();
        String sql = "SELECT * FROM crenels";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while(rs.next()){
            String libel = rs.getString("libel");
            int id = Integer.parseInt(rs.getString("id"));
            crenelModel = new CrenelModel(id,libel);
            crenelsOf.add(crenelModel);
        }
        return crenelsOf;
    }
    
    public CrenelModel selectById(int idParam) throws SQLException{
        CrenelModel crenModel = null;
        String sql = "SELECT * FROM crenels WHERE id = "+idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while(rs.next()){
            int id  = rs.getInt("id");
            String libel = rs.getString("libel");
            
            crenModel = new CrenelModel(id, libel);
        }
        return crenModel;
    }
}
