public class Visualnovel {

    // three fields
    public int characters;
    public int settings;
    public int dialoge;

    // one constructor
    public Visualnovel(int startCharacters, int startSettings, int startDailoge) {
        characters = startCharacters;
        settings = startSettings;
        dialoge = startDailoge;
    }

    // three methods
    public void setCharacters(int newValue) {
        characters = newValue;
    }
        
    public void setSettings(int newValue) {
        settings = newValue;
    }
        
    public void applydialoge(int increment) {
        dialoge += increment;
    }
}