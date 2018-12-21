public class Bird {

    private String bird;
    private String latinBird;
    private int birdCnt;

    public Bird(){
    }

    public Bird(String bird){
        this.bird = bird;
    }

    public Bird(String bird, String latinBird){
     this.bird = bird;
     this.latinBird = latinBird;
    }

    public void incrementBird(Bird bird) {
        bird.birdCnt++;
    }

    public String birdName() {
        return this.bird;
    }

    public String birdLatinName() {
        return this.latinBird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public void setLatinBird(String latinBird) {
        this.latinBird = latinBird;
    }

    public String toString() {
        // Seagull (Dorkus Dorkus): 2 observations
        return bird + " (" + latinBird + "): " + birdCnt + " observations";
    }

}