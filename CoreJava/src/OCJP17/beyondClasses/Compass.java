package OCJP17.beyondClasses;

public enum Compass {
    NORTH("Go UP"),SOUTH("GO SIDEWAYS"),WEST("GO WEST"),EAST("GO EAST");
    private String instruction;
    Compass(String instruction) {
        this.instruction=instruction;
    }

    public void getInstruction(){
        System.out.println(instruction);
    }
}
