package kjellgren.linus.cleancodeprojekt;

public class Calculator {

    private static double answer;

    public static double addition(double number, Components components){
        answer = Double.sum(number, Double.parseDouble(components.getjTextField().getText()));
        components.getjTextField().setText(Double.toString(answer));
        return answer;
    }
    public static double substraction(double number, Components components){
        answer = number - Double.parseDouble(components.getjTextField().getText());
        components.getjTextField().setText(Double.toString(answer));
        return answer;
    }
    public static double multiplication(Double number, Components components){
        Double inDouble = Double.parseDouble(components.getjTextField().getText());
        if (inDouble==0){
            components.getjTextField().setText("");
            components.getLabel().setText("Multiplication by Zero");
            return 0.0;
        }
        answer = number * inDouble;
        components.getjTextField().setText(Double.toString(answer));
        return answer;
    }
    public static double division(double number, Components components){
        Double inDouble = Double.parseDouble(components.getjTextField().getText());
        if (inDouble==0){
            components.getjTextField().setText("");
            components.getLabel().setText("Division by Zero");
            return 0.0;
        }
        answer = number / inDouble;
        components.getjTextField().setText(Double.toString(answer));
        return answer;
    }
    
}
