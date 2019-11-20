package es.iesfranciscodelosrios.algarrido.wolfrol.presenters;

import android.util.Log;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


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

    @Override
    public void validacionCampo(boolean hasFocus, TextInputLayout nombreInputLayout, TextInputEditText n) {
        if (!hasFocus) {
            Log.d("AppCRUD", n.getText().toString());
            if (n.getText().toString().startsWith("rafa")) {
                nombreInputLayout.setError("Nombre incorrecto");

            } else {
                nombreInputLayout.setError("");
            }
        }
    }
}