public class Hdd {
    private int frequency;
    private String quantitymemory;

    public Hdd(int frequency, String quantitymemory){
        this.frequency = frequency;
        this.quantitymemory = quantitymemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hdd hdd = (Hdd) o;
        return frequency == hdd.frequency
                && quantitymemory.equals(hdd.quantitymemory);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nquantityMemory: ");
        stringBuilder.append(this.quantitymemory);
        return stringBuilder.toString();
        //return "\nfrequency: " + this.frequency + "\nquantityMemory: " + this.quantitymemory;

    }

}