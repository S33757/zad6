public class MediaBiblioteczne {

    protected String tytul;
    protected int rokWydania;
    boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz(){
        if(dostepny==true){
            dostepny = false;
            System.out.println("Wypozyczono: " + tytul);
        }else{
            System.out.println("Niedostepne");
        }
    }

    public void zwroc(){
        if(dostepny==false){
            dostepny = true;
            System.out.println("Zwrocono: " + tytul);
        }else{
            System.out.println("Medium nie bylo wypozyczone");
        }
    }

    public String wyswietlInformacje(){
        return "Tytul: " + tytul + ", Rok wydania: " + rokWydania + ", Dostepnosc: " + (dostepny ? "Dostepne" : "Wypozyczone");
    }
}
