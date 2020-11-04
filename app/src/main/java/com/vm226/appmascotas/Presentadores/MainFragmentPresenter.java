package com.vm226.appmascotas.Presentadores;

import android.content.Context;

import com.vm226.appmascotas.Interfaces.IMainFragmentPresenter;
import com.vm226.appmascotas.Mascota;
import com.vm226.appmascotas.db.ConstructorMascotas;
import com.vm226.appmascotas.Interfaces.IMainFragmentView;
import java.util.ArrayList;

public class MainFragmentPresenter  implements IMainFragmentPresenter {


    private IMainFragmentView IMainFragmentView;
    private Context contexto;
   // private MiContructorContactos MiContructorContactos;
    ArrayList<Mascota> mascotas;

    public MainFragmentPresenter(IMainFragmentView IMainFragmentView, Context contexto){
        this.IMainFragmentView=IMainFragmentView;
        this.contexto=contexto;
        obtenerMascotasBaseDatos();
        mostrarMascotasRV();

    }


    @Override
    public void obtenerMascotasBaseDatos() {
        ConstructorMascotas constructorMascotas = new ConstructorMascotas(contexto);
        mascotas = constructorMascotas.obtenerTodasLasMascotas();
    }

    @Override
    public void mostrarMascotasRV() {
        IMainFragmentView.inicializarAdaptadorRV(IMainFragmentView.crearAdaptador(mascotas));
        IMainFragmentView.generarLinearLayoutVertical();
    }
}
