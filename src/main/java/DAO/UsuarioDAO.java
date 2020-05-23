/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.easycoffee.Usuario;
import javax.persistence.*;

/**
 *
 * @author Camilo Vargas
 */
public class UsuarioDAO {
    private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("EasyCoffe_JPAPU");
    
    public void crear(Usuario ob){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(ob);
            em.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally{
            em.close();
        }
    }
    
    public boolean eliminar(Usuario ob){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean aux = false;
        try{
            em.remove(ob);
            em.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally{
            em.close();
            return aux;
        }
    }
    
    public Usuario leer(Usuario ob){
        EntityManager em = emf.createEntityManager();
        Usuario user = null;
        Query q = em.createQuery("SELECT u FROM USUARIO u " + 
                                 "WHERE u.username LIKE :username " + 
                                 "AND u.password LIKE :password")
                                .setParameter("username", ob.getUsername())
                                .setParameter("password", ob.getPassword());
        try{
            user = (Usuario) q.getSingleResult();
        } catch(NonUniqueResultException e){
            user = (Usuario) q.getResultList().get(0);
        } finally {
            em.close();
            return user;
        }
    }
    
    public boolean actualizar(Usuario objetoActual, Usuario nuevoObjeto){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean aux = false;
        try{
            objetoActual= leer(objetoActual);
            objetoActual.setUsername(nuevoObjeto.getUsername());
            objetoActual.setPassword(nuevoObjeto.getPassword());
            objetoActual.setRespuesta(nuevoObjeto.getRespuesta());
            em.merge(objetoActual);
            em.getTransaction().commit();
            aux = true;
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally{
            em.close();
            return aux;
        }
    }
}
