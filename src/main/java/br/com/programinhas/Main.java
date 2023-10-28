package br.com.programinhas;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> produtos = new HashMap<>();
        produtos.put("Mouse", 100);
        produtos.put("Pinga", 300);
        produtos.put("Salame", 50);

        System.out.println("\n\nHASHMAP\n");
        System.out.println(produtos);

        produtos.put("Mouse", 200);
        System.out.println("\n\nHASHMAP\n");
        System.out.println(produtos);

        System.out.println("\nPINGA = " + produtos.get("Pinga"));

        System.out.println("\n MOUSE ? " + produtos.containsKey("Mouse"));
        System.out.println("\n MOUSE ? " + produtos.containsKey("mouse"));
        System.out.println("\n JAGUATIRICA ? " + produtos.containsKey("Jaguatirica"));

        System.out.println("\n ESTOQUE 300 ? " + produtos.containsValue(300));
        System.out.println("\n ESTOQUE 301 ? " + produtos.containsValue(301));

        produtos.putIfAbsent("Mouse", 9000);
        System.out.println("\n\nHASHMAP\n");
        System.out.println(produtos);

        produtos.remove("Mouse");
        System.out.println("\n\nHASHMAP\n");
        System.out.println(produtos);

        System.out.println("\n VAZIO ? " + produtos.isEmpty());
        produtos.clear();
        System.out.println("\n VAZIO ? " + produtos.isEmpty());

    }
}
