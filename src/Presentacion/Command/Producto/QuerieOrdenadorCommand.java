package Presentacion.Command.Producto;

import java.util.ArrayList;

import Negocio.FactoriaNegocio.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Eventos;

public class QuerieOrdenadorCommand implements Command{

	@Override
	public Contexto ejecutar(Object contexto) {
		ArrayList<String> i= FactoriaNegocio.getInstance().generaSAProducto().ordenadoresMasCompradosPorCliente(Integer.valueOf(contexto.toString()));
		if(i == null || i.size() == 0){
			return new Contexto(Eventos.queryOrdenadorCommandError, i);
		}else return new Contexto(Eventos.queryOrdenadorCommand, i);
	}

}
