package com.example.snalmutawa.qatah.StartPage;

public class presenter implements Contractor.OnLoginFinishedListener {

    private View loginView;
    private Contractor loginInteractor;

    presenter(View loginView, Contractor loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }

        loginInteractor.login(username, password, this);
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();

        }
    }
}
