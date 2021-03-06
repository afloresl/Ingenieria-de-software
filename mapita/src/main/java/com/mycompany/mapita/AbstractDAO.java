package com.mycompany.mapita;


import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana
 */
public abstract class AbstractDAO<T> {
    protected SessionFactory sessionFactory;
    
    public AbstractDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    protected void save(T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(obj);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
    }
    protected void update(T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(obj);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
    }
    protected void delete(T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(obj);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
    }
    protected T find(Class clazz, int id){
        T obj = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            obj = (T)session.get(clazz, id);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
        return obj;
    }
    protected List<T> findAll(Class clazz){
    List<T> obj = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From" + clazz;
            Query query = session.createQuery(hql);
            obj = (List<T>)query.list();
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
        return obj;
    }
    
    
}
