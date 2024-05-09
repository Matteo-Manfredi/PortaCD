public class PortaCD {
private CD[] dischi;
private int max_num_cd;

//costruttore master
public PortaCD(int n){
    max_num_cd=n;
    dischi=new CD[max_num_cd];
}
//set CD
public int setCD(CD cd, int posizione){
    int ritorno;
    if(posizione<0||posizione>max_num_cd){
        ritorno=-1;
    }
    else{
        if(dischi[posizione]!=null){
            ritorno=-2;
        }
        else{
            ritorno=posizione;
            dischi[posizione]=new CD(cd);
        }
    }
    return ritorno;  
}
// getCD
public CD getCD(int posizione){

    if(posizione<0||posizione>max_num_cd){
        return null;
        
    }
    else{
        if (dischi[posizione]!=null){
            return new CD(dischi[posizione]);
        }
        else{
            return null;
        }
    }

}
//Kill CD
public int killCD(int posizione){
    int ritorno;
    if(posizione<0||posizione>max_num_cd){
        ritorno=-1;
        
    }
    else{
        if(dischi[posizione]==null){
            ritorno=-2;
        }
        else{
            dischi[posizione]=null;
            ritorno=posizione;
        }
        
    }
    return ritorno;
}
//get NumMaxVolumi
public int getNumMaxDischi(){
    return max_num_cd;

}
//get N
public int getN(){
    int N=0;
    for(int i=0; i<max_num_cd; i++){
        if(dischi[i]!=null){
            N++;
        }
    }
    return N;
}
//toString
public String toString(){
    String s="";
    for(int i=0; i<dischi.length;i++){
        if(dischi[i]!=null){
            s=s+ dischi[i].getTitolo()+"\n";
        }
        else{
            s=s+ "vuoto "+"\n";

        }

    }
  return s;
}
 
//cercaCDperTitolo
public int cercaCDperTitolo(String titolo){
    int ritorno=-1;
    boolean trovato=false;
    int posizione=0;
    while(trovato==false&&posizione<dischi.length){
        if(dischi[posizione]!=null){
            if(titolo.equals(dischi[posizione].getTitolo())){
                trovato =true;
                ritorno =posizione;
            }
        }
        posizione++;

    }
    if(trovato==false){
        ritorno=-2;
    }
    return ritorno;
}

//confrontaCollezione
public int confrontaCollezione(PortaCD pcd){
    int uguali=0;
    for(int a=0; a<max_num_cd; a++){
        for(int b=0; b<max_num_cd; b++){
            if(dischi[a] != null && dischi[a].equals(pcd.dischi[b])){
               uguali++;
            }
        }
    }
    return uguali;
}


public boolean confrontaCollezione2(PortaCD pcd){
    int x=0;
    boolean trovato=true;
    while( trovato=true && x<dischi.length){
        int i=0; 
        while(trovato=true && i<dischi.length){
            // daniel
            if(dischi[x]!=null&&pcd.dischi[i]!=null&&!(dischi[x].equals(pcd.dischi[i]))){
                trovato=false;


            }
            i++;
        }
        x++;
    }
    return trovato;
}

//durante la chiamata di un metodo i dati forniti tramite parametro vengono inseriti nello stack e lo stack viene eliminato con il ritorno
}
