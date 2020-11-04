package com.vm226.appmascotas.Interfaces;

import com.vm226.appmascotas.Adatadores.MascotaAdaptador;
import com.vm226.appmascotas.Mascota;

import java.util.ArrayList;

public interface IMainFragmentView {

    public void generarLinearLayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
