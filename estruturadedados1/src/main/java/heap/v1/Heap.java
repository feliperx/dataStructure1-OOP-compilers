/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap.v1;

/**
 *
 * @author felipex
 */
public class Heap {
    
    int vetor[];
    int n;

    public Heap()
    {
    	vetor = new int[100];
	n = 0;
    }

    public void insere(int chave)
    {
    	 vetor[n+1] = chave; // n é a ultima posição do vetor
  	 ++n;
   	 Subir(n);
    }
// Aumentando a prioridade de um elemento
    void Subir(int Filho)
    {
 	int Pai = Filho / 2;
     	if( Pai >= 1 )
     	{
        	if( vetor[Filho] > vetor[Pai] )
          	{
			int aux;
			aux = vetor[Filho];
			vetor[Filho] = vetor[Pai];
			vetor[Pai] = aux;

                	Subir(Pai);
          	}
     	}
     }

    public String mostra()
    {
    	StringBuffer saida = new StringBuffer();

	for(int i=1; i<=n; i++)
	{
		saida.append(vetor[i]+" ");
	}

	return(saida.toString());
    }


    void Remover()
    {

   	vetor[1] = vetor[n];
   	--n;
   	Descer(1,n);
    }

    void Descer(int Pai,int Total)
    {

    	int Filho = 2*Pai;   // Filho Esquerdo
    	if( Filho <= Total)
    	{
        	if( Filho < Total) // Tem FilhoDir
         	{
               		if(vetor[Filho+1] > vetor[Filho])  ++Filho;
         	}
         	if( vetor[Pai] < vetor[Filho])
         	{
			int aux;
			aux = vetor[Pai];
			vetor[Pai] = vetor[Filho];
			vetor[Filho] = aux;
               		//Trocar Pai e Filho
                	Descer(Filho,Total);
         	}
     	}
     }

   /** Devolve o conteúdo completo da árvore utilizando percurso
       em ordem */

   String mostra(int como) {

      StringBuffer saida = new StringBuffer();
      if(como == 1) percorrePreOrdem(1, saida, 1, 100);
      //else if(como == 2) percorreEmOrdem(1, saida);

      return saida.toString();

   }


   private String espacos(int t)
   {
      StringBuffer string = new StringBuffer();
      for(int i=1;i<=t;++i) string.append(" ");
      return string.toString();
   }


   private void percorrePreOrdem(int posicao, StringBuffer saida, int i, int f) {
       saida.append(espacos(i+((f-i)/2)));
       saida.append(vetor[posicao]+"\n");

       	if(2*posicao <= n) percorrePreOrdem(2*posicao, saida,i ,i+((f-i)/2));
       	if(2*posicao+1 <= n) percorrePreOrdem(2*posicao+1,saida,i+((f-i)/2),f);
   }

   /*private void percorreEmOrdem(SNo no, StringBuffer saida) {
       if(no==null) return;
       if(no.FE != null) percorreEmOrdem(no.FE,saida);
       saida.append(" "+no.chave);
       if(no.FD != null) percorreEmOrdem(no.FD,saida);
   }*/
    
}
