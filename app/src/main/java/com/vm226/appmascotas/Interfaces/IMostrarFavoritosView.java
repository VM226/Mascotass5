package com.vm226.appmascotas.Interfaces;

import com.vm226.appmascotas.Adatadores.MostrarFavoritosAdaptador;
import com.vm226.appmascotas.Mascota;

import java.util.ArrayList;

public interface IMostrarFavoritosView {

    public void generarLinearLayoutVertical();
    public MostrarFavoritosAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MostrarFavoritosAdaptador adaptador);
}
