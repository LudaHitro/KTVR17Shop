/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import interfaces.ModifyEntity;
import interfaces.Persistent;
import java.util.ResourceBundle;

/**
 *
 * @author Hitro
 */
public class Factory {
      private final static ResourceBundle conf = ResourceBundle.getBundle("resourses.config");
    public static Persistent getPersistent(){
        String key = conf.getString("save");
        Persistent p = null;
        switch (key) {
            case "databases":
                p = new ORMPers();
                break;
            case "files":
                p = new FilesPersistImpl();
                break;
            default:
                p = new ORMPers();
        }
        return p;
    }
        
    public static ModifyEntity getEditable(){
        return new ConsoleModifyEntityImpl();
    }
    
}
