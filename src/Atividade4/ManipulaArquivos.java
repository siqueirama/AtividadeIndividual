package Atividade4;

import Atividade1.Pessoa;

import java.io.*;
import java.util.*;
import java.util.stream.*;


public class ManipulaArquivos {

    private File file;
    private BufferedWriter bw;
    private BufferedReader br;


  List<String> lista = new ArrayList<>();

    public void lerArquivoLista() throws IOException {

        FileOutputStream fos;
        FileInputStream fis;

        try {
            FileReader fr = new FileReader("arquivoAtividade4.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                lista.add(str);
            }

        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
        }

        lista.forEach((a) -> System.out.println(a.toString()));
        System.out.println("-----------------");
        lista = lista.stream().sorted().collect(Collectors.toList());
        lista.forEach((a) -> System.out.println(a.toString()));
        gravarArquivo(lista);

    }

    private void gravarArquivo(List<String> lista) throws IOException {

        FileOutputStream fos = new FileOutputStream("novoArquvoAtividade4.txt");
        OutputStreamWriter osw = new  OutputStreamWriter(fos);
        bw = new BufferedWriter(osw);
        for(int i = 0; i < lista.size(); i++ ){
            bw.write(lista.get(i));
            bw.newLine();
        }
        bw.close();
    }

}




