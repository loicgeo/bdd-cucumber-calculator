package features.steps;

public class BusinessException extends Throwable {
    private String name;

    public BusinessException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
