package com.objis.cameroun.Systeme_Scolaire.service;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve;
import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;

public interface ITraitements {
	
	public void enregistrerEnseignant(Enseignant enseig);
	public void enregistrerEleve(Eleve eleve);
	public void afficherDetailsEnseignant(Enseignant enseig);
	public void afficherDetailsEleve(Eleve elev);

}
