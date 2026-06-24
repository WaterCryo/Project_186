package GroupProject;

public class EnergyLabel {

    private double starRating;
    private int certifiedYear;
    private String serialNumber;

    // Deafult
    public EnergyLabel() {
        this.starRating = 0.0;
        this.certifiedYear = 0;
        this.serialNumber = "Unknown";
    }

    // Normal
    public EnergyLabel(
        double starRating,
        int certifiedYear,
        String serialNumber
    ) {
        this.starRating = starRating;
        this.certifiedYear = certifiedYear;
        this.serialNumber = serialNumber;
    }

    // Mutators
    public void setEnergyLabel(
        double starRating,
        int certifiedYear,
        String serialNumber
    ) {
        this.starRating = starRating;
        this.certifiedYear = certifiedYear;
        this.serialNumber = serialNumber;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public void setCertifiedYear(int certifiedYear) {
        this.certifiedYear = certifiedYear;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Accessors
    public double getStarRating() {
        return this.starRating;
    }

    public int getCertifiedYear() {
        return this.certifiedYear;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String toString() {
        return (
            "Star Rating: " +
            starRating +
            "\nCertified Year: " +
            certifiedYear +
            "\nSerial Number: " +
            serialNumber
        );
    }
}
