package es.iesfranciscodelosrios.algarrido.wolfrol.views;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import es.iesfranciscodelosrios.algarrido.wolfrol.R;
import es.iesfranciscodelosrios.algarrido.wolfrol.interfaces.FormularioInterface;
import es.iesfranciscodelosrios.algarrido.wolfrol.presenters.FormularioPresenter;

public class FormularioActivity extends AppCompatActivity implements FormularioInterface.View{
    String TAG="WolfRol/FormularioActivity";
    private FormularioInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        presenter = new FormularioPresenter(this);
        presenter.botonVolver();
    }


    @Override
    public void volverListado() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
