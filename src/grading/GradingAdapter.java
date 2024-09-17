package grading;

import target.SchoolManagementApp;

public class GradingAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystem getGradingSystem() {
        return gradingSystem;
    }

    public void setGradingSystem(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    public GradingAdapter() {
    }

    public GradingAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}
