package com.easycoffee;

import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Hp
 */
public class Usuario extends Persona {

    private String password;
    private String[] respuesta = new String[3];
    private ArrayList<Integer> idLotes;
    private ImageIcon imagen;
    private boolean Rol;
    private ArrayList<Memo> memos;
    private int[] bloqueo;

    /**
     *
     * @param password
     * @param cedula
     * @param nombre
     * @param apellido
     * @param estado
     * @param rta1
     * @param rta2
     * @param rta3
     * @param rol
     */
    public Usuario(String password, Long cedula, String nombre, String apellido,
        boolean estado, String rta1, String rta2, String rta3, boolean rol) {
        super(cedula, nombre, apellido, estado);
        this.password = password;
        this.respuesta[0] = rta1;
        this.respuesta[1] = rta2;
        this.respuesta[2] = rta3;
        this.Rol = rol;
        this.idLotes = new ArrayList<>();
        this.imagen = null;
        this.memos = new ArrayList<>();
        bloqueo = new int[]{0, 0, 0};
    }

    /**
     *
     */
    public void resetBloqueo() {
        bloqueo = new int[]{0, 0, 0};
    }

    /**
     *
     * @return
     */
    public int[] getBloqueo() {
        return bloqueo;
    }

    /**
     *
     * @param bloqueo
     */
    public void setBloqueo(int[] bloqueo) {
        this.bloqueo = bloqueo;
    }

    /**
     *
     * @param password
     * @param imagen
     * @param cedula
     * @param nombre
     * @param apellido
     * @param estado
     * @param rol
     */
    public Usuario(String password, ImageIcon imagen, Long cedula, String nombre, String apellido, boolean estado, boolean rol) {
        super(cedula, nombre, apellido, estado);
        this.password = password;
        this.imagen = imagen;
        this.Rol = rol;
        this.idLotes = new ArrayList<Integer>();
        this.memos = new ArrayList<>();
        bloqueo = new int[]{0, 0, 0};
    }

    /**
     *
     * @param password
     * @param cedula
     * @param nombre
     * @param apellido
     * @param estado
     * @param rol
     */
    public Usuario(String password, Long cedula, String nombre, String apellido, boolean estado, boolean rol) {
        super(cedula, nombre, apellido, estado);
        this.password = password;
        this.Rol = rol;
        this.idLotes = new ArrayList<Integer>();
        this.imagen = null;
        this.memos = new ArrayList<>();
        bloqueo = new int[]{0, 0, 0};
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public ArrayList<Lote> setEspacioDeTrabajo() {
        ArrayList<Lote> lotes = new ArrayList<>();
        return lotes;
    }

    /**
     *
     * @return
     */
    public String[] getRespuesta() {
        return respuesta;
    }

    /**
     *
     * @param respuesta
     */
    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getIdLotes() {
        return idLotes;
    }

    /**
     *
     * @param idLotes
     */
    public void setIdLotes(ArrayList<Integer> idLotes) {
        this.idLotes = idLotes;
    }

    @Override
    public String toString() {
        return "Usuario{" + "password=" + password + '}';
    }

    /**
     *
     * @return
     */
    public boolean isRol() {
        return Rol;
    }

    /**
     *
     * @param Rol
     */
    public void setRol(boolean Rol) {
        this.Rol = Rol;
    }

    /**
     *
     * @return
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return
     */
    public ArrayList<Memo> getMemos() {
        return memos;
    }

    /**
     *
     * @param memos
     */
    public void setMemos(ArrayList<Memo> memos) {
        this.memos = memos;
    }

    /**
     *
     * @param memo
     */
    public void addMemo(Memo memo) {
        this.memos.add(memo);
    }
}
