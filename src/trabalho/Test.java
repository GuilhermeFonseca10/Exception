
package trabalho;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Test{

       public static void main(String [] args) {
           //LinkedList.
           
             List<Produto> produto = new LinkedList<Produto>();
             System.out.println("LinkedList");
            Produto produto1 = new Produto("123", 0 ,"Celular", 1200.0);        
            Produto produto2 = new Produto("321", 2, "Notebook", 2000.0);
               Produto produto3 = new Produto("213", 3, "Tablet", 1000.0);
            produto.add(produto1);
            produto.add(produto2);
            produto.add(produto3);
               System.out.println("Produto 1: "+produto1);
               System.out.println("Produto 2: "+produto2);
               System.out.println("Produto 3: "+produto3);
            Iterator<Produto>produtoIterator=produto.iterator();
            while(produtoIterator.hasNext()) {                
         if(produtoIterator.next().getQuantidade()==0){
            produtoIterator.remove();         
         }                  
       }
            System.out.println("Produtos disponíveis: "+produto.size());
            System.out.println();
            
            //LinkedHashSet
              System.out.println("LinkedHashSet");
           Set<Produto> produtoSet = new LinkedHashSet<>();            
            Produto produto4 = new Produto("234", 1 ,"Celular", 1200.0);        
            Produto produto5 = new Produto("341", 5, "Notebook", 2000.0);
               Produto produto6 = new Produto("543", 4, "Tablet", 1000.0);
                 Produto produto7 = new Produto("543", 4, "Tablet", 1000.0);
          produtoSet.add(produto4);  
             produtoSet.add(produto5);  
                produtoSet.add(produto6);  
                 produtoSet.add(produto7);  
                for(Produto p : produtoSet){
                    System.out.println(p);
                }
                   System.out.println();
                   
                   //TreeMap
              System.out.println("TreeMap");
               NavigableMap<String, String> map = new TreeMap<>(); 
              map.put("Guilherme", "Fonseca");
              map.put("Larissa", "Lorrane");
              map.put("Time", "Flamengo");
              for(Map.Entry<String, String> entry : map.entrySet()){
                  System.out.println(entry.getKey()+" "+entry.getValue());
              }
        System.out.println(map.descendingMap());
       }
}
                                                                      





