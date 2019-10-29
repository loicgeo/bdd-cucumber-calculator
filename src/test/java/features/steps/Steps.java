package features.steps;

import com.loicgeo.katas.service.Calculator;

import java.util.HashSet;
import java.util.Set;

public class Steps {

    public static Calculator calculator = new Calculator();
    private static Set<BusinessException> exceptions = new HashSet<>();

    protected void addException(BusinessException throwable) {
        if (exceptions == null) {
            exceptions = new HashSet<>();
        }
        exceptions.add(throwable);
    }

    public Set<BusinessException> getExceptions() {
        return exceptions;
    }
}
