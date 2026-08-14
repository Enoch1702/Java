public class Graph_Matrix_Implementation
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
   int mat[][];
   int size;
   
   Graph(int size){
       this.size=size;
       mat=new int[size][size];
   }
   
   void addEdges(int s,int d){
      
       mat[s][d]=1;
       mat[d][s]=1;
       
   }
   
   void display(){
       System.out.print("   ");
       for(int i = 0; i < size; i++){
           System.out.print(i+"  ");
       }
       System.out.println();
       for(int i = 0; i < size; i++){
           System.out.print(i+"  " );
           for(int j = 0; j < size; j++){
               System.out.print(mat[i][j]+"  ");
           }
           System.out.println();
       }
   }
    
}