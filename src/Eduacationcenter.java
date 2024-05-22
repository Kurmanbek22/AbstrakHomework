import java.time.LocalDate;

public abstract class  Eduacationcenter {
    private String name;
    private String locatedCountry;
    private LocalDate foundationYear;

    public Eduacationcenter() {
    }

    public Eduacationcenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "Eduacationcenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
