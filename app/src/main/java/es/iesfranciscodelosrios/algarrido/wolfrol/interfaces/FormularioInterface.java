package es.iesfranciscodelosrios.algarrido.wolfrol.interfaces;

import android.view.View;

import es.iesfranciscodelosrios.algarrido.wolfrol.presenters.FormularioPresenter;

public interface FormularioInterface {
    public interface View{
        void volverListado();
        void botonGuardar();
       // void onFocusChange(android.view.View v, boolean hasFocus);
    }

    public interface Presenter{
        void botonVolver();
        void guardarFormulario(FormularioPresenter.Callback callback);

    }
}
