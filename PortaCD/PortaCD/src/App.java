public class App {
    public static void main(String[] args) throws Exception {
        
        CD eminem=new CD("Shady", "Eminem", 10, 50);
        CD pesoPluma=new CD("Messico","Peso Pluma", 15, 60);
        System.out.println(pesoPluma);
        System.out.println(pesoPluma.compareDurata(eminem));
        PortaCD d1=new PortaCD(10);
        System.out.println(d1.getNumMaxDischi());
        d1.setCD(eminem, 5);
        System.out.println("Il numero di dischi è "+d1.getN());
        System.out.println(d1.getNumMaxDischi());
        System.out.println(d1.cercaCDperTitolo("Shady"));
        PortaCD d2=new PortaCD(10);
        d2.setCD(eminem, 5);
        d2.setCD(pesoPluma,9);
        d1.setCD(pesoPluma,6);
        System.out.println(d1);
        System.out.println();
        System.out.println("Il numero di dischi è "+d1.getN());
        System.out.println("I porta CD  hanno in comune "+d1.confrontaCollezione(d2)+" dischi");
        System.out.println(d2);
        System.out.println(d1);
        System.out.println(d1.confrontaCollezione2(d2));
    }
}
