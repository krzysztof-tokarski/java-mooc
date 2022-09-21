
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedTypeCasted = (Song) compared;
        
        boolean sameArtist = this.artist == comparedTypeCasted.artist;
        boolean sameName = this.name == comparedTypeCasted.name;
        boolean sameDuration = this.durationInSeconds == comparedTypeCasted.durationInSeconds;

        boolean allPropertiesMatch = sameArtist && sameName && sameDuration;
        if (allPropertiesMatch) return true;

        return false;
    }


}
