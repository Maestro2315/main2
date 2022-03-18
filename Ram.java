public class Ram {
    private String name;
    private String quantity;
    private String  frequency;

    public Ram(String name, String quantity, String frequency){
        this.name = name;
        this.frequency = frequency;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram = (Ram) o;
        return name.equals(ram.name)
                && quantity.equals(ram.quantity)
                && frequency.equals(ram.frequency);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nquantity: ");
        stringBuilder.append(this.quantity);
        return stringBuilder.toString();

        //return "\nname: " + this.name + "\nfrequency: " + this.frequency + "\nquantity: " + this.quantity;
    }
}