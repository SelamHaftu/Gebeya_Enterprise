package Model;

public class Project {

    String projectTitle;
    String shortProjDescription;
    String programmingLanguageOfProj;
    String priceAgreedForProj;
    String durationOfPrice;
    String status;

    public Project() {

    }

    public Project(String projectTitle, String shortProjDescription, String programmingLanguageOfProj, String priceAgreedForProj, String durationOfPrice, String status) {
        this.projectTitle = projectTitle;
        this.shortProjDescription = shortProjDescription;
        this.programmingLanguageOfProj = programmingLanguageOfProj;
        this.priceAgreedForProj = priceAgreedForProj;
        this.durationOfPrice = durationOfPrice;
        this.status = status;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getShortProjDescription() {
        return shortProjDescription;
    }

    public void setShortProjDescription(String shortProjDescription) {
        this.shortProjDescription = shortProjDescription;
    }

    public String getProgrammingLanguageOfProj() {
        return programmingLanguageOfProj;
    }

    public void setProgrammingLanguageOfProj(String programmingLanguageOfProj) {
        this.programmingLanguageOfProj = programmingLanguageOfProj;
    }

    public String getPriceAgreedForProj() {
        return priceAgreedForProj;
    }

    public void setPriceAgreedForProj(String priceAgreedForProj) {
        this.priceAgreedForProj = priceAgreedForProj;
    }

    public String getDurationOfPrice() {
        return durationOfPrice;
    }

    public void setDurationOfPrice(String durationOfPrice) {
        this.durationOfPrice = durationOfPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
