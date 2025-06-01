package newFeatures;

import org.w3c.dom.ls.LSOutput;

public class SwitchExpr {
    public static void main(String[] args) {



    int choice = 2;
    int x = switch(choice){
        case 1,2,3: yield 9;
        default:yield -1;
    };
        System.out.println("x = " + x);


//        String day = "TH";
//        String result = switch (day) {
//            case "M", "W", "F" -> "MWF";
//            case "T", "TH", "S" -> "TTS";
//            deafult -> {
//                if (day.isEmpty())
//                    yield "insert valid day";
//                else
//                yield "looks like sunday";
//            }
//        };
//    System.out.print(x);
}
    }
