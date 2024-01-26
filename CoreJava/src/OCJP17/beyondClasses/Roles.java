package OCJP17.beyondClasses;

public enum Roles {
    ADMIN{

        public void getAccess(){
            System.out.println("access given for admin role");
        }
    },
    Developer{
        public void getAccess(){
            System.out.println("access given for developer role");
        }
    },
    Tester;
    public void getAccess(){
        System.out.println("No access");
    }

}
