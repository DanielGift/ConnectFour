public class ConnectFour{

  public static String convertColorToString(Color col){
        String color;
        if (col.equals(Color.BLACK))
            color = "Black";
        else if(col.equals(Color.BLUE))
            color = "Blue";
        else if(col.equals(Color.CYAN))
            color = "Cyan";
        else if(col.equals(Color.DARK_GRAY))
            color = "Dark Gray";
        else if(col.equals(Color.GRAY))
            color = "Gray";
        else if(col.equals(Color.GREEN))
            color = "Green";
        else if(col.equals(Color.YELLOW))
            color = "Yellow";
        else if(col.equals(Color.LIGHT_GRAY))
            color = "Light Gray";
        else if(col.equals(Color.MAGENTA))
            color = "LMagneta";
        else if(col.equals(Color.ORANGE))
            color = "Orange";
        else if(col.equals(Color.PINK))
            color = "Pink";
        else if(col.equals(Color.RED))
            color = "Red";
        else if(col.equals(Color.WHITE))
            color = "White";
        else
            color = "Black";
        return color;
    }
    
    public static Color convertStringToColor(String col){
        Color color;
        switch (col.toLowerCase()) {
        case "black":
            color = Color.BLACK;
            break;
        case "blue":
            color = Color.BLUE;
            break;
        case "cyan":
            color = Color.CYAN;
            break;
        case "darkgray":
            color = Color.DARK_GRAY;
            break;
        case "gray":
            color = Color.GRAY;
            break;
        case "green":
            color = Color.GREEN;
            break;
        case "yellow":
            color = Color.YELLOW;
            break;
        case "lightgray":
            color = Color.LIGHT_GRAY;
            break;
        case "magenta":
            color = Color.MAGENTA;
            break;
        case "orange":
            color = Color.ORANGE;
            break;
        case "pink":
            color = Color.PINK;
            break;
        case "red":
            color = Color.RED;
            break;
        case "white":
            color = Color.WHITE;
            break;
        default:
            color = Color.BLACK;
            }
        return color;
    }
}
