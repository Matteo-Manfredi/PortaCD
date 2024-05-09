public class CD {
private String titolo;
private String autore;
private int brani;
private int durata; 

//costruttore master
public CD(String titolo, String autore, int brani, int durata){
    this.titolo=titolo; 
    this.autore=autore;
    this.brani=brani;
    this.durata=durata;
}
//costruttore copia
public CD(CD cd){
    titolo=new String(cd.titolo);
    autore=new String(cd.autore);
    brani=cd.brani;
    durata=cd.durata;

}

//get titlo
public String getTitolo(){
    return titolo;
}
//set titolo
public void setTitolo(String titolo){
    this.titolo=titolo;

}
//get autore
public String getAutore(){
    return autore;
}
//set titolo
public void setAutore(String autore){
    this.autore=autore;
}



//get brani
public int getBrani(){
    return brani;
}
//set brani
public void setBrani(int brani){
    this.brani=brani;
}

//get durata
public int getDurata(){
    return durata;
}
//set dutata
public void setDurata(int durata){
    this.durata=durata;
}


//tostring
public String toString(){
    String s="";
    s="Titolo: "+titolo+"\n"+"Autore: "+autore+"\n"+"Brani: "+brani+"\n"+"Durata: "+durata+" minuti";
   
  return s;
}
 
// equals 
public boolean equals(CD cd){
    boolean uguali=false;
    if(cd==null){
        uguali=false;
    }
    else{
        if(this.titolo.equals(cd.titolo)&&this.autore.equals(cd.autore)&&this.brani==cd.brani&&this.durata==cd.durata){
          uguali=true;
        }
    }
    return uguali;
}
// compare durata
public int compareDurata(CD cd){
    int ritorno;
    if(cd.getDurata()>durata){
      ritorno=1;
    }
    else{
        if(cd.getDurata()==durata){
            ritorno=0;
        }
        else{
            ritorno=1;
        }
    }
    return ritorno;

}
}
