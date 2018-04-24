package org.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.webapp.resource.AbstractRessource;
import org.webservice.services.Utilisateur;  
  
public class Login extends AbstractRessource implements SessionAware{  
private String username,userpass;  
SessionMap<String,String> sessionmap; 
private Utilisateur utilisateur;
private List<Utilisateur> listeUtilisateurs;
  
public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  
  
public Utilisateur getUtilisateur() {
	return utilisateur;
}

public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}

public List<Utilisateur> getListeUtilisateurs() {
	return listeUtilisateurs;
}

public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
	this.listeUtilisateurs = listeUtilisateurs;
}

public String execute(){  
    if(validate(username, userpass)){  
        return "success";  
    }  
    else{  
        return "error";  
    }  
}  

public boolean validate(String mail, String mdp) {
	return getManagerFactory().getUtilisateurManager().validerLogin(mail, mdp);
	
}
  
public void setSession(Map map) {  
    sessionmap=(SessionMap)map;  
    sessionmap.put("login","true");  
}  
  
public String logout(){  
    sessionmap.invalidate();  
    return "success";  
}  
  
}  