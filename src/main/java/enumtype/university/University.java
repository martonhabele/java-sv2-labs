package enumtype.university;

public enum University {
    BME("Budapesti Műszaki Egyetem"), SZTE("Szegedi Tudományegyetem"), SOTE("Semmelweis Orvostudományi Egyetem"), ELTE("Eötvös Loránd Tudományegyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}