/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.*;

/**
 *
 * @author Camilo Vargas
 */
public interface DAO<T, K> {

    void insertar(T a);

    void modificar(T a);

    void eliminar(T a);

    ArrayList<T> obtenerTodos();

    T obtener(K id);
}
