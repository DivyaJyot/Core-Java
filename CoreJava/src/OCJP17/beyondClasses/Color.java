package OCJP17.beyondClasses;

public enum Color {

    RED{
        String getHiddenMeaning(){
            return "fire";
        }
    },
    BLUE{
        String getHiddenMeaning(){
            return "water";
        }
    },
    GREEN{
        String getHiddenMeaning(){
            return "earth";
        }
    },
    YELLOW{
        String getHiddenMeaning(){
            return "wind";
        }
    };
     abstract  String getHiddenMeaning();

}
