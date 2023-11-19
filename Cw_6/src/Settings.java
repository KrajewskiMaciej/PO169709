public class Settings {
    private String version;
    private String language;

    public Settings(String version, String language){
        this.version=version;
        this.language=language;
    }
    public void setVersion(String version){
        this.version=version;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public static Settings defaultSettings(){
        return new Settings("1.0","English");
    }
    public String getVersion(){
        return version;
    }
    public String getLanguage(){
        return language;
    }

}
