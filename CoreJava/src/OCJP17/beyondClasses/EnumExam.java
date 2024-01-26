package OCJP17.beyondClasses;

public class EnumExam {
    public static void main(String[] args) {
        for(Compass comp: Compass.values()){
            comp.getInstruction();
        }
        Color color= Color.RED;
        System.out.println(color.getHiddenMeaning());
        Roles admin=Roles.ADMIN;
        Roles tester=Roles.Tester;
        admin.getAccess();
        tester.getAccess();
        Color  c= Color.YELLOW;
        switch(c){
            case BLUE -> System.out.println("blue found");
            case RED -> System.out.println("Red at hand");
            default -> System.out.println("unrecognized");
        }
    }
}
