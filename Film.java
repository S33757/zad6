public class Film extends MediaBiblioteczne{

    private String rezyser;
    int czasTrwania;

    public Film(String tytul, int rokWydania, String rezyser, int czasTrwania){
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public String wyswietlInformacje(){
        return super.wyswietlInformacje() + "Rezyser: " + rezyser + " Czas Trwania: " + czasTrwania;
    }

    public void sprawdzCzasTrwania(){
        if (czasTrwania > 120){
            System.out.println("Film jest dlugi" + " Czas Trwania: " + czasTrwania);
        }else{
            System.out.println("Film standardowy" + " Czas Trwania: " + czasTrwania);
        }
    }

}
