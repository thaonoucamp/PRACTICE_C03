package officcer.behavirol;

import officcer.creat.Engineer;
import officcer.creat.Officer;
import officcer.creat.Staff;
import officcer.creat.Worker;

public abstract class AbsAction implements IAction<Officer> {
    @Override
    public Officer input() {
        return null;
    }

    public Worker inputWorker() {
        return null;
    }

    public Engineer inputEngineer() {
        return null;
    }

    public Staff inputStaff() {
        return null;
    }

    @Override
    public void add(Officer[] e) {
    }

    @Override
    public void edit(Officer[] e) {

    }

    @Override
    public void delete(Officer[] e) {

    }

    @Override
    public int find(Officer[] e) {
        return 0;
    }

    @Override
    public void sort(Officer[] e) {

    }

    @Override
    public void show(Officer[] e) {

    }
}
