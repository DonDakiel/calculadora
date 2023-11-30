/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

import java.util.ArrayList;
import modelView.ItemDAO;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;


public class ItemController {

    public void saveItem(String usu, ArrayList<String> u) {

        ItemDAO itemDao = new ItemDAO();

        Map<String, Object> items = new HashMap<>();
        items.put(usu, u);
        ;

        itemDao.saveItem("calcu", items);
        System.out.println("Item saved successfully!");
    }



}
