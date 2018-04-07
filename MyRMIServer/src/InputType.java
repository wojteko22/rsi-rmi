import java.io.Serializable;

class InputType implements Serializable {
    private static final long serialVersionUID = 101L;
    private String operation;
    private double x1;
    private double x2;

    String getOperation() {
        return operation;
    }

    double getX1() {
        return x1;
    }

    double getX2() {
        return x2;
    }
}
