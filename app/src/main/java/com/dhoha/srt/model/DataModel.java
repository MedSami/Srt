package com.dhoha.srt.model;

public class DataModel {

    String id, nom, prenom, email, motDePasse,reference;
    String nom_log, type_log, version_log, licence;
    String lib_comp, etat_comp, marque;
    String nom_m, format_m,  type_m;

    public DataModel(String id, String nom, String prenom, String email, String motDePasse, String reference, String nom_log, String type_log, String version_log, String licence, String lib_comp, String etat_comp, String marque, String nom_m, String format_m, String type_m) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.reference = reference;
        this.nom_log = nom_log;
        this.type_log = type_log;
        this.version_log = version_log;
        this.licence = licence;
        this.lib_comp = lib_comp;
        this.etat_comp = etat_comp;
        this.marque = marque;
        this.nom_m = nom_m;
        this.format_m = format_m;
        this.type_m = type_m;
    }

    public String getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getNom_log() {
        return nom_log;
    }

    public String getType_log() {
        return type_log;
    }

    public String getVersion_log() {
        return version_log;
    }

    public String getLicence() {
        return licence;
    }

    public String getLib_comp() {
        return lib_comp;
    }

    public String getEtat_comp() {
        return etat_comp;
    }

    public String getMarque() {
        return marque;
    }

    public String getNom_m() {
        return nom_m;
    }

    public String getFormat_m() {
        return format_m;
    }

    public String getType_m() {
        return type_m;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }
}
