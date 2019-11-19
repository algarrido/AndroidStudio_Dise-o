package es.iesfranciscodelosrios.algarrido.wolfrol.presenters;

import android.telecom.Call;
import android.view.View;

import java.util.Random;

import es.iesfranciscodelosrios.algarrido.wolfrol.interfaces.FormularioInterface;

public class FormularioPresenter implements FormularioInterface.Presenter {

    private FormularioInterface.View view;

    public FormularioPresenter(FormularioInterface.View view){
        this.view=view;
    }

    public interface Callback{
        public void onOk();
        public void onError(String errMsg);
    }

    @Override
    public void botonVolver() {
        view.volverListado();

    }



    @Override
    public void guardarFormulario(Callback callback) {
        //Simular logica guardado ok y ko
        double a = Math.random();
        if (a >= 0.5){
            callback.onError("Error guardando");
        }else {
            callback.onOk();
        }

    }
}