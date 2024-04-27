package assessment;

abstract class Invertebrate extends Animal {

    public Invertebrate() {
        hasBackbones = false;
    }

    /**
     * The phylum of the invertebrate.
     */
    protected String phylum;
}
