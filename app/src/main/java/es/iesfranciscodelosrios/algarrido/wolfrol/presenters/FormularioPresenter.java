package es.iesfranciscodelosrios.algarrido.wolfrol.presenters;

import es.iesfranciscodelosrios.algarrido.wolfrol.interfaces.FormularioInterface;

public class FormularioPresenter implements FormularioInterface.Presenter {

    private FormularioInterface.View view;

    public FormularioPresenter(FormularioInterface.View view){
        this.view=view;
    }
    @Override
    public void botonVolver() {
        view.volverListado();

    }
}