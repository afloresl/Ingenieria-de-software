/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapita;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ana
 */
public class User1DAO extends AbstractDAO<User1>{
   
    public User1DAO(){
       super();
    }
    @Override
    public void save(User1 u){
        super.save(u);
        
    }
    @Override
    public void update(User1 u){
        super.update(u);
        
    }
    @Override
    public void delete(User1 u){
        super.delete(u);
        
    }
    public User1 find(int id){
        return super.find(User1.class,id);
       
        
    }
    public List<User1> findAll(){
        return super.findAll(User1.class);
    }
    public List<User1> buscaPorNombre(String name){
        List<User1> usuarios = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From User1  u where u.name like concat('%',:name,'%')";
            Query query = session.createQuery(hql);
            query.setParameter("name", name);
            usuarios = (List<User1>)query.list();
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return usuarios;
    }
    public User1 buscaPorDatos(String correo, String contrasenia){
        User1 usuario = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From User1  u where u.email = :email and u.password = :password";
            Query query = session.createQuery(hql);
            query.setParameter("email", correo); 
            query.setParameter("password", contrasenia);
            usuario = (User1)query.uniqueResult();
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return usuario;
    }
}
