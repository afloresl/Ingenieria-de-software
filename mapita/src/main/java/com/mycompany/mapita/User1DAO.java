/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapita;

import java.util.List;
/**
 *
 * @author ana
 */
public class User1DAO extends AbstractDAO<User1>{
   
    public User1DAO(){
       super();
    }
    public void save(User1 u){
        super.save(u);
        
    }
    public void update(User1 u){
        super.update(u);
        
    }
    public void delete(User1 u){
        super.delete(u);
        
    }
    public User1 find(int id){
        return super.find(User1.class,id);
       
        
    }
    public List<User1> findAll(){
        return super.findAll(User1.class);
    }
    
}
