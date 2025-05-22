public class Ksiazka extends MediaBiblioteczne{

    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String wyswietlInformacje(){
        return super.wyswietlInformacje() + "Autor: " + autor + "LiczbaStron: " + liczbaStron;
    }

    public void sprawdzLiczbeStron(){
        if (liczbaStron > 500){
            System.out.println("Ksiazka jest dluga" + " LiczbaStron: " + liczbaStron);
        }else{
            System.out.println("Ksiazka jest standardowa" + " LiczbaStron: " + liczbaStron);
        }
    }


}
