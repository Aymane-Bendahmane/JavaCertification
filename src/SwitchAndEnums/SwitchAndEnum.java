package SwitchAndEnums;

import static SwitchAndEnums.SwitchAndEnum.Condition.HOT;

public class SwitchAndEnum {
    enum Condition {
        HOT, COLD, WORM
    }

    static String serveWithSwitchStatement(Condition condition) {
        String result;
        switch (condition) {
            case HOT:
                result = "HOT";
                break;
            case COLD:
                result = "COLD";
                break;
            case WORM:
                result = "WORM";
                break;
            default:
                result = "unknown";

        }
        return result;
    }

    static String serveWithSwitchExpression(Condition condition) {
        return switch (condition) {
            case HOT -> "HOT";
            case COLD -> "COLD";
            case WORM -> "WORM";
        };
    }

    static String serveWithSwitchStatementYield(Condition condition) {
        return switch (condition) {
            case HOT:
                yield "HOT";

            case COLD:
                yield "COLD";
            case WORM:
                yield "WORM";
        };
    }

    public static void main(String[] args) {
        System.out.println("Regular Switch statement : "+serveWithSwitchStatement(HOT));
        System.out.println("Regular Switch statement : "+serveWithSwitchExpression(Condition.COLD));
        System.out.println("Regular Switch statement : "+serveWithSwitchStatementYield(Condition.WORM));
    }

}
