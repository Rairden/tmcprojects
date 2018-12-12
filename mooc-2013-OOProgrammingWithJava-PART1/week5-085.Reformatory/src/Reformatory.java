public class Reformatory {
    /**
     * Add to class Reformatory the method public void feed(Person person)
     * that increases the weight of its parameter by one.
     *
     *  Add to class Reformatory the method public int totalWeightsMeasured()
     *  that returns the total number of times a weight has been measured.
     *
     */


    private int total = 0;

    public int weight(Person person) {
        // return the weight of the person
        total++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int a = person.getWeight() +1;
        person.setWeight(a);
        total++;
    }

    public int totalWeightsMeasured() {
        return total;
    }

}
