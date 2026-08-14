import java.util.ArrayList;
public class Graph_ArrayList_Implementation
{
	public static void main(String[] args) {
	    Graph g=new Graph(5);
	    
	    g.addEdges(0,1);
	    g.addEdges(0,4);
	    g.addEdges(1,3);
	    g.addEdges(1,1);
	    g.addEdges(2,3);
	    g.addEdges(3,2);
	    g.display();
		
	}
}
class Graph{
   int size;
   ArrayList<ArrayList<Integer>> ajlist;
   
   Graph(int size){
       this.size=size;
       ajlist = new ArrayList<>();

       for(int i=0;i<size;i++){
            ajlist.add(new ArrayList<>());
       }
   }
   
   void addEdges(int s,int d){
        ajlist.get(s).add(d);
        ajlist.get(d).add(s);
   }
   
   void display(){
        for(int i=0;i<size;i++){
            System.out.print(i+" ");
            for(int j=0;j<ajlist.get(i).size();j++){
                System.out.print(ajlist.get(i).get(j)+" ");
            }
            System.out.println();
        }
   }
    
}