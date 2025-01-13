public class ShortExample {

    // public short getShortValue() {
    //     return 202;
    // }


    private short id;
    public ShortExample() {}
    public ShortExample(short id) {
        this.id = id;
    }
    
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

        public void display() {
        System.out.println(id);
    }

    
    public static void main(String[] args) {
        ShortExample example = new ShortExample();
        example.setId((short) 200);
        System.out.println(example.getId());
        example.display();

        // short value = example.getShortValue();
        // System.out.println("Returned short value: " + value);

        // short paramValue = 2000;
        // example.display(paramValue);

    }
}
