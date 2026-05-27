package org.example;
    import java.util.ArrayList;
    import java.util.List;
public class Main {
    public static void main(String[] args) {
        Categoria catManga = new Categoria("manga y anime", 50, 9);
        Categoria catStarWars = new Categoria("star wars", 30, 8);
        Categoria catIndie = new Categoria("desarrollo de videojuegos indie", 20, 10);

        Cosplayer cosplayer1 = new Cosplayer(
                "sopas", "chile", 24,
                3, EstiloCosplay.ANIME
        );
        Artista artista1 = new Artista(
                "pepe", "argentina", 28,
                "libro cualquiera", 5
        );
        cosplayer1.agregarCategoria(catManga);
        cosplayer1.agregarCategoria(catStarWars);
        artista1.agregarCategoria(catManga);
        artista1.agregarCategoria(catIndie);
        Agrupacion clubFans = new Agrupacion("legion papu", catStarWars);
        clubFans.agregarPersona(cosplayer1);

        System.out.println("\ninfo cosplayer");
        cosplayer1.mostrarInformacion();
        System.out.println("\ninfo artista");
        artista1.mostrarInformacion();
        System.out.println("\ninfo agrupacion");
        clubFans.mostrarInformacion();
        List<Interactivable> expositoresInteractivos = new ArrayList<>();
        expositoresInteractivos.add(cosplayer1);
        expositoresInteractivos.add(artista1);

        for (Interactivable expositor : expositoresInteractivos) {
            System.out.println("ejecutando presentación interactiva:");
            expositor.realizarPresentacion();
            System.out.println();
        }
        Panel panelDebate = new Panel(catManga, "15:30 hrs");
        panelDebate.agregarPanelista(artista1);
        panelDebate.agregarPanelista(clubFans);
        System.out.println("\ninfo del panel");
        panelDebate.mostrarInformacion();
        panelDebate.eliminarPanelista(artista1);
        panelDebate.eliminarPanelista(clubFans);
        System.out.println("panel cancelado, relaciones de asistencia eliminadas con exito");
    }
}
