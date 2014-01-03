package com.educativo.dao;

import com.educativo.entidad.Persona;
import com.educativo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nelson
 */
public class PersonaDao {

    private Session sesion;
    private Transaction trans;

    public void insertPersona(Persona p) {

        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            trans = sesion.beginTransaction();
            Persona persona = new Persona();
            persona.setNombre(p.getNombre());
            persona.setNacimiento(p.getNacimiento());
            persona.setEmail(p.getEmail());
            persona.setEstado(Short.parseShort("1"));
            sesion.save(persona);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sesion.close();
        }

    }
}
