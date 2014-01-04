/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.educativo.bean;

import com.educativo.dao.PersonaDao;
import com.educativo.entidad.Persona;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonaBean {
    
    private Persona persona = new Persona();
    private PersonaDao personaDo = new PersonaDao();
    
    public PersonaBean() {
        
    }
    
    public String adicionarPersona() {
        personaDo.insertPersona(persona);
        return "sucessos";
    }
    
    public String removerPersona() {
        personaDo.deletePersona(persona);
        return "sucesremove";
    }
    
    public Persona getPersona() {
        return persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }    
}
