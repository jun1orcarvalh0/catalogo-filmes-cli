package main.java.cli.filmes.catalogo.ui;

import java.util.ArrayList;
import java.util.List;

public interface PagedList<T> {
    List<T> listar(int pagina, int tamanhoPagina);
    List<ArrayList> listarNome(int pagina, int tamanhoPagina);
}
