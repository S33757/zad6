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
        return super.wyswietlInformacje() + ", Autor: " + autor + ", Liczba stron: " + liczbaStron;
    }

    public void sprawdzLiczbeStron(){
        if (liczbaStron > 500){
            System.out.println("Ksiazka jest dluga," + " Liczba stron: " + liczbaStron);
        }else{
            System.out.println("Ksiazka jest standardowa," + " Liczba stron: " + liczbaStron);
        }
    }


}
