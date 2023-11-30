/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Facade;


/**
 *
 * @author afprietoa
 */
public class ItemDAO {

    /**
     *
     * @param items, list to save
     */
    public void saveItem(String id, Map<String,Object> items) {
        FirebaseDatabase connexion = null;
        try {
            connexion = Facade.getConnection();
            DatabaseReference ref = connexion.getReference("/");
            DatabaseReference childReference = ref.child(id);

            childReference.setValue(items);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
    }

    ;
    

}
