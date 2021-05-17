package officcer.behavirol;

import officcer.creat.Officer;

public abstract class AbsAction implements IAction<Officer> {
    @Override
    public Officer input() {
        return null;
    }

    public void inputWorker() {

    }

    public void inputEngineer() {

    }

    public void inputStaff() {

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
    public void find(Officer[] e) {

    }

    @Override
    public void sort(Officer[] e) {

    }

    @Override
    public void show(Officer[] e) {

    }
}
